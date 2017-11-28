import math

test = int(input())

for _ in range(test):
    book = list(map(float, input().split()))
    numCandles = int(input())
    check = False

    for _ in range(numCandles):
        x,y = map(float, input().split())
        dist = math.sqrt(abs(book[0] - x)**2 + abs(book[1]-y)**2)
        if dist <= 8 and check == False:
            check = True
    if check == True:
        print("light a candle")
    else:
        print("curse the darkness")
        
