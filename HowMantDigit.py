import math

while True:
    try:
        val = int(input())

        if val == 0:
            print("0")
            continue
        if val == 1:
            print("1")
        s = 0
        for i in range(2,val+1):
            s += math.log10(i)
        print(math.floor(s) + 1)
    except EOFError:
        break
