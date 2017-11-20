def findInts(s):
    i = s.find('+')
    n = int(s[:i])
    p = int(s[i+1:])
    return (n + p) 


n = int(input())
for _ in range(0,n):
    line = input()
    if line == "P=NP":
        print("skipped")
    else:
        print(findInts(line))
