def char_to_int(char):
    return int(ord(char) - ord('A')) 

def int_to_char(n):
    return chr(ord('A') + n) 

def word_sum(word):
    return sum(map(char_to_int, word))  

def rotate_char(n):
    def func_(char):
        return int_to_char((char_to_int(char) + n) % 26)  
    return func_ 

def rotate_word(word, n):
    return ''.join(map(rotate_char(n), word)) 

def sum_and_rotate(word):
    return rotate_word(word, word_sum(word)) 

def rotate_word_by_word(w1, w2):
    new_str = '' 
    for (c1, c2) in zip(w1, w2):
        new_str += rotate_char(char_to_int(c2))(c1)  
    return new_str 

def solve(message):
    return rotate_word_by_word(sum_and_rotate(message[:len(message)//2]), sum_and_rotate(message[len(message)//2:])) 

print(solve(input())) 
