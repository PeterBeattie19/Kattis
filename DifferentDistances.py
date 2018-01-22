import sys, math

for line in sys.stdin:
  #print line
  arr = line.split()
  if len(arr) == 1:
    break
  x1,y1,x2,y2,p = map(float , arr) 
  
  p1 = abs(x1 - x2)**p
  
  p2 = abs(y1 - y2)**p
  
  p = float(p)
  p = float(1/p)
  print (p1 + p2) ** p 
