words = []

while True:
    try:
        words.extend(input().split())
    except EOFError:
        break


result = set()

for i in range(len(words)):
    for j in range(len(words)):
        if i!=j:
            result.add(words[i] + words[j])

result = sorted(result) 

for s in result:
    print(s)

