def area(x, y):
    sum = 0
    for i in range(-1,len(x)-1):
        sum += x[i] * (y[i + 1] - y[i - 1])
    return sum/2.0



n = int(input())

while n != 0:
    X = []
    Y = []
    for _ in range(n):
        x,y = map(int, raw_input().split())
        X.append(x)
        Y.append(y)
    s = area(X,Y)
    if s <= 0:
        print "CW",abs(s)
    else:
        print "CCW",abs(s)
    n = int(input())
