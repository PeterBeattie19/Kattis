import sys
best = 10000000000000

def solve(a, last_jump, cost, pos):
    global best
    if pos < 0 or pos >= len(a):
        return  10000000000000 
    if pos == len(a)-1:
        ans = cost + a[pos] 
        if ans <  best:
            best = ans
        return ans 
    if cost > best:
        return 10000

    return min(solve(a, last_jump, cost+a[pos], pos-last_jump), solve(a, last_jump+1, cost+a[pos], pos + last_jump + 1)) 

n = int(sys.stdin.readline())
a = []
for i in sys.stdin:
    a.append(int(i))
print(solve(a, 1, 0, 1)) 
