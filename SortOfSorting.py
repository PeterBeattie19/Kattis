import sys

li = []

while 1:
    input = sys.stdin.readline()
    input = input.rstrip("\n")
    if input.isdigit():
		if li != [] :
			for a in sorted(li, key=lambda x:x[:2]):
				print a
			li = []
			print " "
		if input == "0":
			break
    else :
        li.append(input)
