line = input()

while True:
    try:
        n = int(line)

        r = 1
        k = 1

        while(r % n != 0):
            r *= 10
            r += 1
            r %= n
            k += 1
        print(k)
        line = input()
    except EOFError:
        break
