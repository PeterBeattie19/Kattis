T = int(input())

for _ in range(T):
    xs = map(int,input().split()[:-1])
    sm = 0
    prv = 1
    for x in xs:
        if x > 2*prv:
            sm+=x-2*prv
        prv = x
    print(sm)
