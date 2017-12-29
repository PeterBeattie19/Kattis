import math

def isPrime(x):
    if x == 2:
        return True
    if x == 1:
        return False

    for i in range(2,int(math.sqrt(x))+1):
        if x%i == 0:
            return False
    return True


n = int(input())
found = False

if(n==1):
    print("no")
    found = True

elif isPrime(n):
    print("yes")
    found = True



else:
    
    for i in range(2,int(math.sqrt(n))+1):
        if isPrime(i):
            val = i
            j = 2
            while val < n :
                val = i**j
                j+=1
            if val == n:
                print("yes")
                found = True
                break

if found == False:
    print("no")
    
