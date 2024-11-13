print_multiplication_table():
    num = int(input("Enter a number: "))
    print(f"Multiplication Table of {num}:")
    
    for i in range(1, 11):
        product = num * i
        print(f"{num} x {i} = {product}")

print_multiplication_table()

