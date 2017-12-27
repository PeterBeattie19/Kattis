def countOnes(num):
    c = 0
    s1 = bin(num)
    for i in s1[2:]:
        if i == '1':
            c += 1
    return c
    

n = int(input())

for _ in range(n):
    x = str(input())
    temp = 0
    i = 10
    m = -1
    running = ''

    for i in x:
        running += i
        count = countOnes(int(running))
        if  count > m:
            m = count
    print(m)
