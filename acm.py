score, solved = 0, 0 
penalities = {}
while True:
    line = input() 
    if line == "-1": break

    line = line.split() 
    if line[-1] == "right":
        score += int(line[0]) 
        if line[1] in penalities:
            score += penalities[line[1]] * 20
        solved += 1

    if line[1] not in penalities:
        penalities[line[1]] = 1
    else:
        penalities[line[1]] += 1

print(solved, score) 