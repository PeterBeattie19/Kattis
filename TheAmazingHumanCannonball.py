import math

def check(v,o,x,h1,h2):
    o *= (math.pi/180)
    t = x/(v*math.cos(o))
    y = x*math.tan(o) - (0.5*9.81*(t**2))
    if y >= h1 and y<=h2:
        return True
    return False

num = int(input())

for i in range(num):
    arr = list(map(float, input().split()))
    if check(arr[0],arr[1],arr[2],arr[3]+1.0,arr[4]-1.0):
        print("Safe")
    else:
        print("Not Safe")

