failed = 0 
passed = 0
count = 1 
for count in range(15):
 number = int(input("Enter scores:"))
 if number < 45:
    failed += 1
 if number >= 45:
     passed = passed + 1
print("This are the number of passed:",passed)
print("The number of failed are:",failed) 
count += 1  