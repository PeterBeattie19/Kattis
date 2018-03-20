arr = raw_input().split()

var = {}

while True:

    if len(arr) == 1:
        if line[0]=='0':
            break
        elif line[0] in var:
            print var[line[0]]
        else:
            print line[0]

        arr = raw_input().split()
        continue
    
    if arr[1]== '=':
        var[arr[0]] = int(arr[2])
        arr = raw_input().split()
    else:
        res =''
        total = 0
        words = []
        for i in range(0,len(arr),2):
            if arr[i] in var:
                total += var[arr[i]]
            elif arr[i].isdigit():
                total += int(arr[i])
            else:
                words.append(arr[i])


        if len(words) == 0:
            print total
            arr = raw_input().split()
            continue

        if total > 0:
            print total,
            print "+",

        if len(words) ==1:
            print words[0]
            arr = raw_input().split()
            continue

        print words[0],"+",

        for i in words[1:len(words)-1]:
            print i,
            print "+", 
        print words[len(words)-1]
            
        arr = raw_input().split()
        
