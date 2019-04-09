from math import factorial
n = int(raw_input())
for _ in range(n):
    print str(factorial(int(raw_input())))[-1]