line = input().split() 
count = 1
while True:

    try:
        cust = dict()
        res = dict() 

        while True:
            line = input().split()
            if line[0] == "CLOSE":
                break

            if line[0] == "ENTER":
                cust[line[1]] = int(line[2])

            elif line[0] == "EXIT":
                if line[1] in res:
                   # temp = res[line[1]]
                    res[line[1]] += 0.1*(int(line[2]) - cust[line[1]])
                else:
                    res[line[1]] = 0.1*(int(line[2]) - cust[line[1]])
        print("Day",count)
        count+=1
       # print(sorted(res.items()))

        for arr in sorted(res.items()):
            a = arr[1]
            a = "%.2f" % (a,)
            print(arr[0],"$"+str(a))
        print()
    except EOFError:
        break
    
        
                    
