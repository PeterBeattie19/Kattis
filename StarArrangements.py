def check (i, j, n):
  s1 = 0
  ans = False; 
  k = 0 
  while s1 < n:
    if k%2 == 0:
      s1 += i
    else:
      s1 += j
    if s1 > n: return False
    k += 1 

  #print(s1)
  if s1 == n: ans = True 

  else: ans = False
  return ans


n = int(input())
print(n, end='')
print(":") 

for i in range(2,int((n/2)+2)):
  for j in  range(i-1,i+1):
    if check(i,j,n) == True :
      print(i, end='')
      print(",", end='')
      print(j) 
    


