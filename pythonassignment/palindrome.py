num = int(input("Enter a three-digit integer: "))
num = abs(num)

   digit1 = num // 100
   digit2 = (num // 10) % 10
   digit3 = num % 10

   if digit1 == digit3:
       print(f"{num} is a palindrome integer.")
   else:
      print(f"{num} is not a palindrome integer.")
