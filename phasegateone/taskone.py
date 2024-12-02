'''
prompt user to enter number 
collect 
save as sum
create a variable to store the guessed number
store as random_number
create a variable to store the sum of the random_number
store as sum_of_random_number
determine if the sum == sum_of_random_number
print "True"
else
print "False"
'''

import random
sum = int(input("Enter the sum of two numbers:"))
random_number = random.randint(1 , 100)
sum_of_random_number = random_number + random_number

if sum == sum_of_random_number:
	print("True")
else:
	print("False")