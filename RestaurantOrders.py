def solve(a, order, res, sum, pos, memo):
    if sum == 0:
        res.append(order) 
        return 1
    if sum < 0:
        return 0
    if pos < 0 and sum >= 1:
        return 0
    
    if memo[sum][pos-1] != -1:
        return memo[sum][pos-1] 
    
    memo[sum][pos-1] = solve(a, list(order + [a[pos]]), res, sum-a[pos], pos, memo) + solve(a, order, res, sum, pos-1, memo) 
    return memo[sum][pos-1] 



n = int(input())
prices = list(map(int, input().split())) 
prices = list(filter(lambda x: x!=0, prices))
n = len(prices)
m = int(input())
budgets = list(map(int, input().split()))



mp = {prices[i]:i+1 for i in range(n)}


for i in budgets:
    memo = [[-1 for _ in range(len(prices)+1)] for _ in range(i+1)]
    res = []
    ans = solve(prices, [], res, i, n-1, memo) 
    if ans == 0:
        print("Impossible")
    elif ans == 1:
        temp = sorted([str(mp[j]) for j in res[0]]) 
        print(" ".join(temp)) 
    else:
        print("Ambiguous")