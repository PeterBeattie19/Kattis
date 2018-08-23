while True:
	n, m = map(int, input().split())
	if n == 0 and m == 0: break

	best = 10000000000000.0
	best_a = 0
	best_b = 0
	for _ in range(n):
		a, b = map(int, input().split())
		if a > m: continue
		v = b/a
		if str(v) == str(best):	
			if a < best_a:
				continue
			else:
				best_a = a
				best_b = b

		elif v < best:
			best = v
			best_a = a
			best_b = b 
	if best_a == 0 and best_b == 0:
		print("No suitable tickets offered")
	else:
		print("Buy " +str(best_a)+ " tickets for $" +str(best_b))