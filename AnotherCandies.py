num = int(input())

for _ in range(0,num):

    space = input()

    numOfKids = int(input())
    sum = 0

    for _ in range(0,numOfKids):
        sum += int(input())

    if(sum % numOfKids == 0):
        print("YES")
    else:
        print("NO") 
