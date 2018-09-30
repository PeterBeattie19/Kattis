s = input() 
stck = [] 
indent = ""

for i in range(len(s)):
    if s[i] == '{':
        indent += "  "
        
    elif s[i] == '}':
        indent = indent[:-2] 
    else:
        if s[i+1] == '}':
            print(indent, s[i]) 
        else:
            print(indent, s[i], ",")  