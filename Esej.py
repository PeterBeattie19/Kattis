import random
import sys

def gen_vocab(a, b):
	vocab = []
	length = a if b < a else b
	for i in range(length):
		s = [chr(random.randrange(97,123)) for _ in range(8)] 
		t = ''.join(s)
		vocab.append(t) 	
	return vocab

a, b = map(int, input().split())

'''
it contains at least A, and at most B words;

every word contains at least one, and at most 15 letters;

the used vocabulary is large enough, in other words, the essay contains at least B/2 different words.
'''

b = b//2
length = a if b < a else b
count = 0

for i in range(97,123):
	for j in range(97,123):
		for k in range(97,123):
			for e in range(97,123):
				s = chr(i) + chr(j) + chr(k) + chr(e)
				print(s, end=' ') 
				count += 1
				if count == length: exit()
