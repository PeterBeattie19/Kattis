num = int(input())

for i in range(1,num+1):
    n,k = map(int, input().split())

    if(k % 2**n) == (2**n - 1):
        print("Case #", end='')
        print(i,end='')
        print(": ON")
    else:
        print("Case #", end='')
        print(i,end='')
        print(": OFF")

