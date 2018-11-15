from math import ceil
def solve(graph, cur, left, original_sizes):
    if cur in left or len(graph[cur]) < ceil(original_sizes[cur]/2): 
        left.add(cur) 
        for i in graph[cur]:
            graph[i].remove(cur) 
        for i in graph[cur]:
            if  len(graph[i]) <= ceil(original_sizes[i]/2):
                print(cur) 
                solve(graph, i, left, original_sizes) 

c, p, x, L = map(int, input().split()) 
x -= 1 ; L -= 1

graph = [set() for _ in range(c)]

for _ in range(p):
    a, b = map(int, input().split())
    a -= 1 ; b -= 1
    graph[a].add(b)
    graph[b].add(a) 

original_sizes = list(map(len, graph)) 

left = set()
left.add(L) 
solve(graph, L, left, original_sizes) 

if x in left or len(graph[x]) < ceil(original_sizes[x]/2):
    print("leave")
else:
    print("stay")