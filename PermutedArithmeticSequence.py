
n = int(input())

for i in range(0,n):
    arr = list(map(int, input().split()))
    arith = True
    perm = True
    non = True
    
    
    temp = arr[1:]
    arr = arr[1:]
    temp.sort()

    first = abs(arr[1] - arr[0])
    for j in range(2,len(arr)):
        if abs(arr[j] - arr[j-1]) != first:
            arith = False
            break
    


    first = abs(temp[1] - temp[0])
    
    for j in range(2,len(temp)):
        diff = abs(temp[j] - temp[j-1])
        if diff != first:
            perm = False
            break
        
    if arith == True:
        print("arithmetic")
    elif perm == True:
        print("permuted arithmetic")
    else:
        print("non-arithmetic")
