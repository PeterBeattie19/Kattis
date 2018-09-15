s, v1, v2 = map(int, input().split()) 
res = 100000000000000
fa = -1
fb = -1

for a in range(s+1):
    b = int((s - v1*a)/v2)
    if (s - v1*a)%v2 == 0 and b >= 0:
        if a+b < res:
            fa = a
            fb = b
            res = a+b 


print("Impossible") if fa == -1 else print(fa, fb)