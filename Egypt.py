arr = list(map(int,raw_input().split()))

while not(arr[0]==0 and arr[1]==0 and arr[2]==0):

    if (arr[0]**2 + arr[1]**2) == arr[2]**2:
        print "right"

    elif (arr[1]**2 + arr[2]**2) == arr[0]**2:
        print "right"

    elif (arr[0]**2 + arr[2]**2) == arr[1]**2:
        print "right"

    else:
        print "wrong"
    arr = list(map(int,raw_input().split()))
