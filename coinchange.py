def solve(coins, pos, sum):
    if sum == 0:
        return 1
    if sum < 0:
        return 0
    if pos<0 and sum >= 1:
        return 0 

    return solve(coins, pos, sum - coins[pos]) + solve(coins, pos-1, sum) 


sm, _ = map(int, input().split()) 
c = list(map(int, input().split())) 

print(solve(c, len(c)-1, sm))
