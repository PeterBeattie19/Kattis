import sys
import heapq

mp = {}
s = set()
a = []
c = 0
for line in sys.stdin:
    if line in mp:
        mp[line] += 1
    else:
        mp[line] = 1

    if line not in s:
        s.add(line)
        heapq.heappush(a, line) 
    c += 1
    
    #if line == '0': break

size = len(a)
while len(a) != 0:
    i = heapq.heappop(a) 
    sys.stdout.write(i +" "+ str(float((mp[i]/c)*100)) +"\n")
sys.stdout.flush() 

    