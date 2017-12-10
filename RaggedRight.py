import sys

paragraph = [line for line in sys.stdin]

largest = max(map(len,paragraph))
s = 0
for i in paragraph:
    s += (largest - len(i))**2

print(s)
        
    
