r,n = map(int, input().split())

booked = []

for i in range(n):
    booked.append(int(input()))

found = False

for i in range(1,r+1):
    if i not in booked:
        found = True
        print(i)
        break
if not found:
    print("too late")
    
