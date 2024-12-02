'''
Pseudocode
stage1
1.prompt user to enter two integer  under 100
2.collect numbers
3.save
4.sum up both numbers
5.is the sum is correct
6.print true
7.else
8.print false
'''
number1 = int(input("Enter first number under 100  "))
number2 = int(input("Enter second number under 100  "))


sum = number1 + number2

if sum == number1 + number2:
	print("true")
else:
	print("false")

print('the sum of two integer', sum)