from math import factorial

def calculate_combinations(n, r):
    return factorial(n) / (factorial(r) * factorial(n-r))


n = int(input()) 

for _ in range(n):
    n, r = map(int, input().split()) 
    print(int(calculate_combinations(n,r-1))) 