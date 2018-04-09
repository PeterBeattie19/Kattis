n = int(raw_input())

arr = []

for _ in range(n):
    arr.append(int(raw_input()))


m = 1
s = set()
i = 0

while i < n:
    res = arr[i]%m
    #print s,"i",i,"res",res
    if res in s:
        #print "EXE"
        i = -1
        m += 1
        s.clear()
    
    else:
        s.add(res)
    i += 1

print m
