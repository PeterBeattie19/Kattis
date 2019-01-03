input() ; a = list(map(int, input().split()))

arrows = set()
c = 0

for i in a:
#    print(arrows)
    if i in arrows:
        arrows.remove(i)
        arrows.add(i-1) 
    else:
        arrows.add(i-1) 
        c += 1

#print(arrows)
print(c) 