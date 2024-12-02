'''
prompt user to enter number three times 
collect
store each of them as first_number, second_number,third_number
if first_number < second_number and second_number < third_number
display first_number,second_number,third_number
if first_number > second_number and first_number < third_number
display second_number,first_number,third_number
if first_number < second_number and first_number > third_number
display third_number,first_number,second_number
if first_number == second_number and first_number == third_number
display third_number,first_number,second_number
if first_number > second_number and second_number > third_number
display third_number,second_number,first_number
'''






numberone = int(input("Enter first number:"))
numbertwo = int(input("Enter second number:"))
numberthree = int(input("Enter third number:"))

if numberone < numbertwo and numbertwo < numberthree:
	print(f"{numberone},{numbertwo},{numberthree}")

if numberone > numbertwo and numberone < numberthree:
	print(f"{numbertwo},{numberone},{numberthree}")

if numberone < numbertwo and numberone > numberthree:
	print(f"{numberthree},{numberone},{numbertwo}")

if numberone == numbertwo and numberone == numberthree:
	print(f"{numberthree},{numberone},{numbertwo}")

if numberone > numbertwo and numbertwo > numberthree:
	print(f"{numberthree},{numbertwo},{numberone}")
