language = {}

while True:
    try:
        line = input().split()
        if line[0] == "define" :
            language[line[2]] = int(line[1])
        else:
            if line[1] not in language or line[3] not in language:
                print("undefined")
                continue
            if line[2] == '<' :
                if(language[line[1]] < language[line[3]]):
                    print("true")
                else:
                    print("false")
                    
            elif line[2] == '>' :
                if(language[line[1]] > language[line[3]]):
                    print("true")
                else:
                    print("false")
            elif line[2] == "=":
                if(language[line[1]] == language[line[3]]):
                    print("true")
                else:
                    print("false")
    except EOFError:
        break
