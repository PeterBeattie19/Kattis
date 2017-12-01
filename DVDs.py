num = int(input())

for _ in range(num):
    numDVD = int(input())
    arr = list(map(int, input().split()))
    count = 1
    for i in arr:
        if i == count:
            count += 1
    print(numDVD - (count-1))   
