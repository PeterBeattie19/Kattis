line = input().split()

height = (2**(int(line[0])+1) - 1) 

if len(line) == 1:
	print(height)
	exit()

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
