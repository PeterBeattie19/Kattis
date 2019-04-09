n = int(raw_input())
print sum([reduce(lambda x,y: x*y, list(map(float, raw_input().split()))) for _ in range(n)])