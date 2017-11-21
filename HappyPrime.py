import math

def sumSquares(n):
    ans = 0
    while(n > 0):
        ans += int(n%10)**2
        n /= 10
    return ans

def isPrime(n):
    for i in range(2,int(math.sqrt(n)+1)):
        if n%i == 0:
            return False
    return True

num = int(input())

for i in range(0,num):
    line = list(map(int, input().split()))
    print(line[0], end=' ')
    print(line[1], end=' ')
    prev = []

    if isPrime(line[1]) == False:
        print("NO")
    
    else:
        val = line[1]
        prev.append(val)
        while True:
            val = sumSquares(val)

            if val in prev:
                print("NO")
                break
            prev.append(val)
            if(val == 1):
                print("YES")
                break
