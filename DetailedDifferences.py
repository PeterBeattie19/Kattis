num = int(input())

for _ in range(0,num):
    s1 = input()
    s2 = input()

    print(s1)
    print(s2)

    for i in range(0,len(s1)):
        if s1[i] != s2[i]:
            print("*", end='')
        else:
            print(".", end='')
    print()
    print()
