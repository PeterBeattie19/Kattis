import functools

def gcd(int(x),int(y)):
    if x<1 or y<1 :
        return -1
    remainder = 0

    while y!=0:
        remainder = x%y
        x = y
        y = remainder
    return x


def lcm(a,b):
    if a==0 or b==0:
        return 0
    return (a*b) / gcd(a,b)



while True:
    try:
        arr = list(map(int, input().split()))
        print(int(functools.reduce(lcm,arr[1:],arr[0])))
    except EOFError:
        break
