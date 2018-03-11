size,red = map(int,raw_input().split())

arr = list(map(int, raw_input().split()))

for i in range(0,len(arr)):
    arr[i] -= red


max_ending_here = arr[0]
max_so_far = arr[0]

for i in arr[1:]:
    max_ending_here = max(i, max_ending_here + i)
    max_so_far = max(max_so_far, max_ending_here)

print max_so_far
