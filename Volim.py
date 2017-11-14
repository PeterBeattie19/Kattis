k = int(input())
n = int(input())

timeLimit = 210
tsf = 0 #Time so far
p = k 

for i in range(0,n):
    t1, q = input().split()
    time = int(t1)

    tsf += time

    if tsf >= timeLimit:
        break;

    if q == 'T':
        p += 1
    if p==9:
        p = 1

print(p) 
