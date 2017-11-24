while True:
    arr = list(map(int, input().split()))

    if sum(arr) == 0:
        break
    print((120 + (arr[0] - arr[1] + 40) % 40 + (arr[2] - arr[1] + 40) % 40 + (arr[2] - arr[3] + 40) %40)*9)
