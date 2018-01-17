def area(x, y):
    sum = 0
    for i in range(-1,len(x)-1):
        sum += x[i] * (y[i + 1] - y[i - 1])
    return sum/2.0


n = int(input())

for _ in range(n):
    arr = list(map(int, raw_input().split()))
    size = arr[0] 
    arr = arr[1:]
    x = []
    y = []
    for i in range(0,len(arr),2):
        x.append(arr[i])
        y.append(arr[i+1])
    print area(x,y)
