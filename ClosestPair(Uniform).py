import math

dist = lambda a, b: math.sqrt((a[0] - b[0])**2 + (a[1] - b[1])**2)

def solve(p):
	p = sorted(p, key = lambda x: x[0])

	d = dist(p[0], p[1]) 
	st = [p[0], p[1]] 

	for i in range(1, len(p)):
		for j in range(i-1, 0, -1):
			value = dist(p[i], p[j])
			if abs(p[i][0] - p[j][0]) > d:
				break

			elif value < d:
				d = value
				st = [p[j], p[i]] 
	return st



n = int(input())

while n != 0:

	points = [list(map(float, input().split(' '))) for _ in range(n)] 
	res = solve(points)

	for i in res:
		print(i[0],i[1],end=' ')
	print()


	n = int(input())
