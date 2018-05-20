n = int(input()) #num of categories 

mp = {}
results = {}

for _ in range(n):
	line = input().split() 
	results[line[0]] = 0

	for i in line[2:]:
		if i not in mp:
			mp[i] = []
			mp[i].append(line[0])
		else:
			mp[i].append(line[0])


while True:
	try:
		line = input().split()

		if len(line) == 0:
			break
		for i in line:
			if i in mp:
				for j in mp[i]:
					results[j] += 1
		

	except EOFError:
		break

a = sorted(results.items(), key = lambda x: x[1])

a.reverse()
change = a[0][1]

ugh = []

for i in a:
	if i[1] != change:
		break
	ugh.append(i[0])

ugh.sort()

print("\n".join(ugh))
