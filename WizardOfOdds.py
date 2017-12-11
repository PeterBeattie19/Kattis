import math

n, guess = map(int, input().split())

for i in range(0,guess):
    n = math.ceil(n/2)

if n>1:
    print("You will become a flying monkey!")
else:
    print("Your wish is granted!")

