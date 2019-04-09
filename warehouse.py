t = int(raw_input())
for _ in range(t):
    n = int(raw_input())
    mp = {}
    for i in range(n):
        item = raw_input().split()
        if item[0] in mp:
            mp[item[0]] += int(item[1])
        else:
            mp[item[0]] = int(item[1])
    print len(mp)
    res = sorted(mp.iteritems(), key=lambda x: (-x[1], x[0]))
    for i in res:
        print " ".join(list(map(str, i)))
