import math

while True:
    try:
        arr = list(map(int, input().split()))
        n = arr[0]
        result = [0] * n
        result[0] = 1
        arr = arr[1:]
        e = True
        for i in range(1,len(arr)):
            diff = abs(arr[i-1] - arr[i])
            if diff >= n:
                print("Not jolly")
                e = False
                break
            result[diff] = 1

        if e == False:
            continue
        check = False
        
        for i in result[:n-1]:
            if i != 1:
                print("Not jolly")
                check = True
                break
        if check == False:
            print("Jolly")
    except EOFError:
        break
