import sys
def solve(graph, cur, left, original_sizes):
    if cur not in left or len(graph[cur]) <= (original_sizes[cur]/2) or (len(graph[cur]) == 1): 
        left.add(cur) 
        for i in graph[cur]:
            if cur in graph[i]:
                graph[i].remove(cur) 
        for i in graph[cur]:
            if  len(graph[i]) <= (original_sizes[i]/2) or (len(graph[i]) == 1 and original_sizes[i] > 1):
                #print(cur)
                solve(graph, i, left, original_sizes) 

c, p, x, L = map(int, sys.stdin.readline().split()) 
x -= 1 ; L -= 1

graph = [set() for _ in range(c)]

for _ in range(p):
    a, b = map(int, sys.stdin.readline().split())
    a -= 1 ; b -= 1
    graph[a].add(b)
    graph[b].add(a) 

original_sizes = list(map(len, graph)) 

left = set()
#left.add(L) 
try:
    solve(graph, L, left, original_sizes) 
except Exception:
    print("leave")
    exit()

if x in left:
    print("leave")
else:
    print("stay")