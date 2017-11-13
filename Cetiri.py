arr = list(map(int, input().split()))

arr.sort()

d1 = arr[1] - arr[0]
d2 = arr[2] - arr[1]

val = 0

if d1 == d2:
    val = arr[2] + d1

if d1 < d2 :
    val = arr[1] + d1

if d2 < d1 :
    val = arr[0] + d2 

print(val) 

# 12 10 6
# 6 10 12
