print((lambda x: (x[0]-1) // (x[1]//x[2]) if (x[0]-1) % (x[1]//x[2]) == 0 else (x[0]-1) // (x[1]//x[2]) + 1)(tuple(map(lambda x: int(x), input().split()))))
