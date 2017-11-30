import math
while(True):
    d,v = map(int,input().split())
    if d==0 and v==0:
        break
    print("%.7f" % (pow(d**3 - (6.0/math.pi)*v, 1.0/3)))
