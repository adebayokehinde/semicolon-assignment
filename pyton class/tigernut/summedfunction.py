def get_sum (number:list) -> int:
	if type(number) is list:
		summed = 0
		mutiplication = 0
		for count in number:
			summed += count
		mutiplication  = summed * len(number)
		mutiplication = mutiplication - summed
		return mutiplication
	raise TypeError("Not a list object")

print(get_sum([1, 2, 3, 4,5]))