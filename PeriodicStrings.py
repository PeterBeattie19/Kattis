def check(s,n):
    sub = s[:n]

    for i in range(n,len(s),n):
        temp = s[i:(i+n)]
        other = temp
        #print other," ",
        temp = temp[1:] + temp[0]
        if temp != sub:
            return False
        sub = other
    return True

s = raw_input()


size = 1

while True:
    if check(s,size):
        print size
        break
    size += 1
    
