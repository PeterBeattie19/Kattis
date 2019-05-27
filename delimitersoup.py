_, stm = input(), input() 

stack = []

delimeters_map = {'}': '{', ']': '[', ')': '('}
delimeters = {'{', '[', '('}

for i in range(len(stm)):
    if stm[i] in delimeters:
        stack.append(stm[i]) 
    elif stm[i] != ' ':
        if len(stack) == 0 or stack[-1] != delimeters_map[stm[i]]:
            print(stm[i], i) 
            exit() 
        else:
            stack.pop(-1) 

print("ok so far")
