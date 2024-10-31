digit = int(input("Enter 5-digit integer:"))
digit1 = digit // 10000
reminder1 = digit % 10000
digit2 = reminder1 // 10000
reminder2 = reminder1 // 100
digit3 = reminder2 // 100
reminder3 = reminder2 % 100
digit4 = reminder3 // 10
reminder4 = reminder3 % 10

print(f"{digit1} {digit2} {digit3} {digit4} {reminder4}  " )