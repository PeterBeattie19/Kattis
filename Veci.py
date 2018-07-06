

def match(a, b):
	a1 = [0 for _ in range(10)]
	a2 = [0 for _ in range(10)]
	for (i,j) in zip(a,b):
		a1[int(i)] += 1
		a2[int(j)] += 1

	for (i,j) in zip(a1, a2):
		if i != j:
			return False
	return True


n = int(input())
i = n+1

while len(str(i)) <= len(str(n)):
	if match(str(i), str(n)):
		print(i)
		exit()
	i += 1	

print("0") 