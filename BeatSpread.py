num = int(input())

for i in range(0,num):
    arr = list(map(int, input().split()))
    x = arr[0]
    y = arr[1]
    
    a = int((x + y)/2)
    b = x - a
    if(a*2 == x+y and b >= 0):
        print(a,b)
    else:
        print("impossible")
        
