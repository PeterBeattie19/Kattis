line = input().split()

height = (2**(int(line[0])+1) - 1) 

if len(line) == 1:
	print(height)
	exit()


left = lambda i,arr: arr[(2*i)+ 1]
right = lambda i,arr: arr[(2*i) + 2] 

index = 0
value = height
for i in line[1]:
	if i == 'L':
		value = height - ((2*index) + 1)
		index = ((2*index) + 1)
	else:
		value = height - ((2*index) + 2)
		index = ((2*index) + 2)

print(value)