n = int(input())

for i in range(0,n):
    line = input().split()

    numOfGnomes = int(line[0])

    val = 0
    prev = int(line[1])

    for j in  range(2,numOfGnomes+1):
        val = int(line[j])
        if val != prev+1 :
            print(j)
            break
        prev = val
#END
