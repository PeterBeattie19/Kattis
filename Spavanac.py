line = input().split()
hour = int(line[0])
minute = int(line[1])

minute -= 45

if minute < 0:
    hour -=1

print(hour % 24, end=" ")
print(minute % 60) 
