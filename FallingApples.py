def solve(grid, r, c):
    if r >= len(grid)-1:
        return grid

    elif grid[r+1][c] == '#':
        return solve(grid, r+2, c) 

    elif grid[r][c] == '.':
        return solve(grid, r+1, c) 

    if grid[r+1][c] == 'a':
        grid = solve(grid, r+1, c) 

    if grid[r+1][c] == 'a':
        return grid

    if grid[r+1][c] == '.':
        grid[r][c] = '.'
        grid[r+1][c] = 'a' 
        return solve(grid, r+1, c) 

r, c = map(int, input().split())

grid = []

for _ in range(r):
    grid.append(list(input())) 

for i in range(c):
    grid = solve(grid, 0, i) 

for i in grid:
    print(''.join(i)) 