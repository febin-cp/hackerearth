n = int(input())
for i in range(0,n):
    str1 = input()
    str2 = input()
    char1 = [0]*26
    char2 = [0]*26
    count = 0
    for j in range (0,len(str1)):
        char1[ord(str1[j])-97] = char1[ord(str1[j])-97] + 1 
    for j in range (0,len(str2)):
        char2[ord(str2[j])-97] = char2[ord(str2[j])-97] + 1
    for j in range (0,len(char1)):
        count = count + abs(char1[j] - char2[j])
    # print(char1)
    print(count)