def sumDig(i):
    i = int(i)
    s = 0

    while i > 0:
        s += int(i%10)
        i = int(i/10)
    return s

L = int(input())
D = int(input())
X = int(input())

#Find N
n = 0

for i in range(L,D+1):
    if sumDig(i) == X:
        n = i
        break

#Find M
m = 0
for i in range(D,L-1, -1):
    if sumDig(i) == X:
        m = i
        break

print(n)
print(m) 
