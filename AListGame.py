import math

def isPrime(n):
    for i in range(2,int(math.sqrt(n))+1):
        if n%i == 0:
            return False
    return True

def findSol(n):
    if(isPrime(n)):
       return 1

    for i in range(2,n):
       if(n % i == 0):
           return findSol(i) + findSol(int(n/i))


n = int(input())
print(findSol(n))
