num = int(input())

for _ in range(num):
    temp = input()
    numcs, numec = map(int, input().split())
    cs = list(map(int, input().split()))
    ec = list(map(int, input().split()))
    avgcs = 0
    avgec = 0
    for i in cs:
        avgcs += i
        
    for i in ec:
        avgec += i
        
    avgcs = float(avgcs/numcs)
    avgec = float(avgec/numec)

    count = 0
    for i in cs:
        if i < avgcs and i > avgec:
            count+=1
print(count) 
        
