n = 500
low = 0
high = 1000
count = 0
print(n)
while True:
    try:
        s = input()
    
        if s == "correct":
            break

        elif s == "lower":
            high = n - 1
            n = int((n + low)/2)

        elif s == "higher":
            low = n + 1
            n  = int((high+low)/2)

        print(n)

    except EOFError:
        break
    
        
