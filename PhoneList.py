t = int(input())

for _ in range(t):
    n = int(input())
    arr = []

    for _ in range(n):
        arr.append(input())


    found = False

    for i in range(0,len(arr)):
        prefix = arr[i]
        for j in range(0,len(arr)):
            s = arr[j]
            if i != j and prefix == s[:len(prefix)]:
                found = True
                print("NO")
                i = len(arr) 
                break


    if not found:
        print("YES")
    
    
