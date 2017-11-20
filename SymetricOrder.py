n = int(input())
count = 1

while n != 0:
    arr = []
    for i in range(0,n):
        arr.append(input())
    print("SET " , end='')
    print(count)
    count += 1

    if n%2 == 1:
        for i in range(0,n,2):
            print(arr[i])
        for i in range(n-2,0,-2):
            print(arr[i])
    else:
        for i in range(0,n,2):
            print(arr[i])
        for i in range(n-1,0,-2):
            print(arr[i]) 


        
    n = int(input())

 
