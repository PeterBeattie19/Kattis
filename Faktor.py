import math
arr = input().split() 
a = int(arr[0])
i = int(arr[1])

j = 0

while(True):
    if(math.ceil(j * (1/a)) == i) :
       print(j)
       break
    j += 1
