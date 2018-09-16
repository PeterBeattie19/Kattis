memo = [] 

def solve(arr, target, pos, total, total_sum):
    if total_sum == target:
        memo.append(total) 
        return 1
    if total_sum > target:
        return 0

    if pos < len(arr) - 1:
        return solve(arr, target, pos, total+[arr[pos]], total_sum+arr[pos]) +  solve(arr, target, pos+1, total+[arr[pos]], total_sum+arr[pos]) + solve(arr, target, pos+1, total, total_sum) 
    else:
        return solve(arr, target, pos, total+[arr[pos]], total_sum+arr[pos])

_ = input()
prices = list(map(int, input().split()))
_ = input()
targets = list(map(int, input().split())) 


for i in targets:
    ans = solve(prices, i, 0, [], 0)
    if ans >= 2:
        print("Ambiguous")
    elif ans == 0:
        print("Impossible")
    elif ans == 1:
        print(memo[-1])
print(memo)