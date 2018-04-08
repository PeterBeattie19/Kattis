from __future__ import print_function


t = int(raw_input())

for _ in range(t):
    cmd = raw_input()
    n = int(raw_input())

    if n == 0:
        s = raw_input()
        
        found = False
        
        for i in cmd:
            if i == 'D':
                found = True
                break
        if found:
            print("error")
        else:
            print("[]")
        continue

    s = raw_input()
    s = s[1:len(s)-1]
    arr = list(map(int, s.split(",")))



    direction = 1
    l = 0
    r = len(arr)

    error = False

    for i in cmd:

        if l == r:
            error = True
            break
        
        if i == 'R':
            direction = 1 if direction==0 else 0
            continue

        if direction==1:
            l += 1
        else:

            r -= 1

    if error:
        print("error")
        continue

    if direction == 1:
        ans = ",".join(str(x) for x in arr[l:r])
        '''print "[",
        print ans,
        print "]" '''

        print("[" +ans+ "]")

    else:
        arr = arr[l:r]
        arr = arr[::-1]
        ans = ",".join(str(x) for x in arr)
        print("[" +ans+ "]")
