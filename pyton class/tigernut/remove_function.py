def removal (number: list) -> list:
		if len(number) > 2:
			removed = number.pop(1)
			return number
		elif len(number) <= 2 :
			return 0