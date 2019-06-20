import java.awt.font.NumericShaper.Range;
import java.util.Scanner;

public class seatingArrangement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i =0;i<num;i++) {
			int n = scan.nextInt();
			int mod = n%12;
			int hola = n/12;
//			System.out.println(12 - mod);
			if(n%12 != 0) {
				int seat = n/12*12 + 12 - mod + 1;
				
				if(n%12 == 1 || n%12 == 6 || n%12 == 7) {
					System.out.println(seat+" "+ "WS");
				}
				if(n%12 == 2 || n%12 == 5 || n%12 == 8 || n%12 == 11) {
					System.out.println(seat+" "+ "MS");
				}
				if(n%12 == 3 || n%12 == 4 || n%12 == 9 || n%12 == 10) {
					System.out.println(seat+" "+ "AS");
				}
			}
			else {
				System.out.println(n - 11+" "+ "WS");
			}
		}
	}

}
