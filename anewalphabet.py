dict_ = {
    "A": "@",
    "B": "8",
    "C": "(",
    "D": "|)",
    "E": "3",
    "F": "#",
    "G": "6",
    "H": "[-]",
    "I": "|",
    "J": "_|",
    "K": "|<",
    "L": "1",
    "M": "[]\\/[]",
    "N": "[]\\[]",
    "O": "0",
    "P": "|D",
    "Q": "(,)",
    "R": "|Z",
    "S": "$",
    "T": "']['",
    "U": "|_|",
    "V": "\\/",
    "W": "\\/\\/",
    "X": "}{",
    "Y": "`/",
    "Z": "2"
}

def get_index(map):
    def func_(index):
        if index not in map: 
            return index
        return map[index] 
    return func_

def translate_word(word, translate_map):
    func_ = get_index(translate_map)
    return "".join(map(func_, word)) 

print(translate_word(input().upper(), dict_)) 
