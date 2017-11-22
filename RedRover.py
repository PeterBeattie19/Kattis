s = input()

min = 1000000

checked = set()

for i in range(1,int(len(s))+1):
    for j in range(0,len(s)-i):
        ch = s[j:j+i]

        if ch in checked:
            continue
        checked.add(ch)
        c = s.count(ch)
        ans = len(s) - (i*c) + c + i

        if ans < min:
            min = ans
if(min > len(s)):
    print(len(s))
else:
    print(min)


