size,para = map(int, raw_input().split()) 

s = {}

for _ in range(size):
    line = raw_input().split()
    s[line[0]] = int(line[1]) 




for _ in range(para):
    sum = 0

    

    while True:
    	l =raw_input()
    	if l[0]=='.':
    		break

    	l = l.split()

        for i in l:
            #print i
            if i in s:
                sum += s[i]
    print sum
