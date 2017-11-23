n = int(input())

arr = sorted([int(input()) for i in range(n)], reverse=True)

total = 0

i = 0
while i + 2 < len(arr):
	total += arr[i] + arr[i+1]
	i += 3

while i < len(arr):
	total += arr[i]
	i += 1

print(total)
