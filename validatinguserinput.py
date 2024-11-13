
user_input = input('Enter a number --> ')

    user_input = float(user_input)    
  user_input = int(user_input)

     print(2 + user_input)
   while true:
    user_input = input('Enter a number --> ')

   try:
     user_input = int(user_input)
     break

   except ValueError:
      print('INVALID: you need to enter a number!')
      print()

print(2 + user_input)
