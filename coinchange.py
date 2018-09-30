def solve(coins, pos, sum, memo):
    if sum == 0:
        return 1
    if sum < 0:
        return 0
    if pos < 0 and sum >= 1:
        return 0 

    if memo[sum][pos-1] != 0:
        return memo[sum][pos-1] 
     

    memo[sum][pos-1] = solve(coins, pos, sum - coins[pos], memo) + solve(coins, pos-1, sum, memo) 
    return memo[sum][pos-1] 


sm, _ = map(int, input().split()) 
c = list(map(int, input().split())) 
memo = [[0 for _ in range(len(c))] for _ in range(sm+1)]

print(solve(c, len(c)-1, sm, memo))
print()
for i in memo:
    print(i) 