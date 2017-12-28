def countDoubles(s1):
    c = 0
    arr = ['a','o','u','i','e','y'] 
    for i in range(0,len(s1)-1):
        if s1[i] in arr and s1[i] == s1[i+1]:
            c += 1
    return c

n = int(input())

while n != 0:
    arr = []
    ans = ''
    m = -1
    count = 0
    for _ in range(n):
        s = str(input())
        count = countDoubles(s)
        if count > m:
            ans = s
            m = count
    
    print(ans)
    n = int(input())
        
