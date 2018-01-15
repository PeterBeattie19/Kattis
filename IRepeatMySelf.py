n = int(input())

for _ in range(n):
    s = raw_input()
    
    for i in range(1,len(s)):
        ans = i
        multiplier = (int(len(s) // i) + 1)
        if s == (s[0:i] * multiplier)[0:len(s)]:
            print i
            break


    
