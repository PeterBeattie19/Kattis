def check(a, n):
    s = 0
    for j in range(0,len(a)):
        if j != n:
            s += a[j]
    if s == a[n]:
        #print(n)
        return True
   # print(n)
    return False


while True:
  try:
    a = list(map(int, input().split()))
   # print(a)
    for i in range(0,len(a)):
      if check(a, i) == True:
        print(a[i])
        break
  except EOFError:
    break
