'''
1.prompt user to enter number between 0 and 1000
2.collect it                                                                   
3. save
                                                                        
'''

user_input = int(input("Enter number between 0 - 1000:"))
first_number = user_input // 1000
first_reminder = user_input % 1000
second_number = first_reminder // 100
second_reminder = first_reminder % 100
third_number = second_reminder // 10
third_reminder = second_reminder % 10
sum_of_numbers = first_number + second_number + third_number + third_reminder
print(sum_of_numbers)