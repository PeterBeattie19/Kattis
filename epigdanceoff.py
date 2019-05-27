def get_input():
    n, _ = map(int, input().split())
    return [input() for i in range(n)]


def transpose(arr):
    return [[arr[i][j] for i in range(len(arr))] for j in range(len(arr[0]))] 


arr = get_input() 
search_term = ["_" for i in range(len(arr))] 
print(transpose(arr).count(search_term)+1) 
