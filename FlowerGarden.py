import math

def dist(n,m):
    return math.sqrt(abs(n[0]-m[0])**2 + abs(n[1]-m[1])**2)

def isPrime(n):
    if n == 1:
        return False
    if n == 2:
        return True

    for i in range(2,int(math.sqrt(n))+1):
        if n%i == 0:
            return False
    return True


T = int(input())

for _ in range(T):
    n,m = map(int, input().split())

    m = float(m)
    grid = []
    for _ in range(n):
        grid.append(list(map(int, input().split())))

    origin = [0,0]

    c = 0
    lastKnown = 0

    for i in grid:
        #print(dist(origin,i), " The dist")
        if dist(origin,i) <= m:
            c += 1
            m -= dist(origin,i) 
            origin = i
            if isPrime(c):
                lastKnown = c
        else:
            break

    print(lastKnown) 