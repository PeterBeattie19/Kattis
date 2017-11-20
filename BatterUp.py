n = int(input())

arr = list(map(int, input().split()))
s = 0

for i in arr:
    if i != -1:
        s += i
    else:
        n -= 1

print(s/n)
