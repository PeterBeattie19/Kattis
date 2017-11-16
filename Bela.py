vals = [{'A':11, 'K':4, 'Q':3, 'J':20, 'T':10, '9':14, '8':0, '7':0},
        {'A':11, 'K':4, 'Q':3, 'J':2, 'T':10, '9':0, '8':0, '7':0}]

n,b = input().split()
n = int(n)


sum = 0

for i in range(0,4*n):
    c = input()
    if c[1] == b:
        sum += val[0][c[0]]
    else:
        sum += vals[1][c[0]]

print(sum) 
