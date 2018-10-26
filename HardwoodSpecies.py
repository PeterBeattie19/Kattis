import sys

mp = {}
s = set()
c = 0
for line in sys.stdin:
    if line in mp:
        mp[line] += 1
    else:
        mp[line] = 1

    s.add(line)
    c += 1

#    if line == '0': break

names = sorted(s) 

for i in names:
    print(i, float((mp[i]/c)*100))  