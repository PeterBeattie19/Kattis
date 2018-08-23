def f(x, memo):
    if memo[x] != 0: return memo[x] 

    else:
        memo[x] = f(x-1, memo) + f(x-2, memo) 
        return memo[x] 

t = int(input()) 
memo = [0] * 10001
memo[0] = 1
memo[1] = 2
for _ in range(t):
    i = int(input()) 
    print(f(i, memo)%(10**9 + 7))