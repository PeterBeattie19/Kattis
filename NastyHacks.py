num = int(input())

for i in range(0,num):
    r, e, c = input().split()
    r = int(r)
    e = int(e)
    c = int(c)
    
    e -= c
    if(r==e):
        print("does not matter")

    elif r > e :
        print("do not advertise")
    else :
        print("advertise")
         
