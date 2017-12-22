import math
import fileinput

line = fileinput.input()

n,guess = int(line[0]) , int(line[1])

for i in range(0,guess):
    n = math.ceil(n/2)
if(n>1):
    print "You will become a flying monkey!"
else:
    print "Your wish is granted!"

