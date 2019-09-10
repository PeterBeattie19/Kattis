def index_of_smallest(arr):
    indx, mx = 0, arr[0] 
    for (i, j) in enumerate(arr):
        indx, mx = (i, j) if j < mx else (indx, mx) 
    return indx, mx

input() 
inputs = list(map(int, input().split()))

print(index_of_smallest(inputs)[0]) 

