from itertools import combinations
from functools import reduce

def find_subset_of_equal_sum(a): 
    b = [list(combinations(a, i)) for i in range(1, len(a)+1)]
    b = reduce(lambda x, y: x+y, b, []) 
    mp = {} 

    for i in b:
        sm = sum(i) 
        if sm in mp:
            mp[sm].append(i)
            if len(mp[sm]) == 2:
                return mp[sm] 
        else:
            mp[sm] = [i]
    return None

t = int(input())
for _ in range(t):
    a = list(map(int, input().split()))[1:] 
    res = find_subset_of_equal_sum(a) 
    if res:
        print("Case #"+str(_ + 1)+":")
        print(" ".join(map(str, res[0]))) 
        print(" ".join(map(str, res[1]))) 
    else:
        print("Impossible")
