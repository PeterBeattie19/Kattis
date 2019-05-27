def count(arr):
    mp = {}
    for i in arr:
        if i in mp:
            mp[i] += 1
        else:
            mp[i] = 1
    return mp


n = int(input())
a = count([input() for _ in range(n)]) 
b = sorted(a.items(), key=lambda x: x[1])
print("\n".join(sorted(map(lambda y: y[0], list(filter(lambda x: x[1]==b[0][1], b)))))) 
