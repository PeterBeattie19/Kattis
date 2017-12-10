def range_prod(lo,hi):
    if lo+1 < hi:
        mid = (hi+lo)//2
        return range_prod(lo,mid) * range_prod(mid+1,hi)
    if lo == hi:
        return lo
    return lo*hi

def fact(n1):
    if n1 < 2:
        return 1
    return range_prod(1,n1)

import sys, math

for line in sys.stdin:
    try:
        
        n,m = map(int, line.split())
        if m == 0:
            print(m,end='')
            print(" does not divide ", end='')
            print(n,end='')
            print("!")
            continue
        
        if m <= n:
            print(m,end='')
            print(" divides ", end='')
            print(n,end='')
            print("!")
            continue
        
        if m == 1:
            print(m,end='')
            print(" divides ", end='')
            print(n,end='')
            print("!")
            continue
        
        count = 0
        M = m

        for i in range(2, math.ceil(math.sqrt(m))+1):
            while m%i == 0:
                m /= i
                count +=1
            if count > 0:
                j = i
                while j <= n:
                    count -= n / j
                    j *= i
                if count > 0:
                    print(M,end='')
                    print(" does not divide ", end='')
                    print(n,end='')
                    print("!")
                    continue
            count = 0

        if m<=n:
            print(M,end='')
            print(" divides ", end='')
            print(n,end='')
            print("!")
        else:
            print(M,end='')
            print(" does not divide ", end='')
            print(n,end='')
            print("!") 

    except EOFError:
        break
    
