numTrips = int(input())
trips = {}

for _ in range(numTrips):
    s = input().split()
    if s[0] not in trips:
        trips[s[0]] = []
    trips[s[0]].append(int(s[1]))

for _,i in trips.items():
    i.sort()

q = int(input())

for i in range(q):
    s = input().split()
    print(trips[s[0]][int(s[1])-1])
    
