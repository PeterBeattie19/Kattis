_ = int(input())
x = list(map(int, input().split())) 
st = []

for i in x:
    if  len(st) == 0:
        st.append(i)
        continue
    if (i + st[-1]) % 2 == 0:
        st.pop()
    else:
        st.append(i) 

print(len(st))