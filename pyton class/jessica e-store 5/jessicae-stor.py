class Product:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def __str__(self):
        return f"{self.name} - ${self.price}"

# Creating instances of the products
laptop = Product("Laptop", 1000)
phone = Product("Phone", 500)
headphones = Product("Headphones", 100)

# Storing the products in a list
product_catalogue = [laptop, phone, headphones]

def view_products():
    print("Product Catalogue:")
    for product in product_catalogue:
        print(product)

view_products()

def add_to_cart(cart, product_name):
    for product in product_catalogue:
        if product.name.lower() == product_name.lower():
            cart.append(product)
            print(f"{product.name} has been added to your cart.")
            return
    print(f"{product_name} not found in product catalogue.")

# Example usage
cart = []
add_to_cart(cart, "Phone")
add_to_cart(cart, "Laptop")

def view_cart(cart):
    if not cart:
        print("Your cart is currently empty.")
    else:
        print("Your Shopping Cart:")
        for product in cart:
            print(product)
    print()  # For better readability

view_cart(cart)

def calculate_total(cart):
    total = sum(product.price for product in cart)
    return total

def checkout(cart):
    total = calculate_total(cart)
    if cart:
        print(f"Thank you for shopping with us! Your total is ${total}.")
        cart.clear()
    else:
        print("Your cart is empty. Please add items to your cart before checkout.")

# Example usage
checkout(cart)
view_cart(cart)  # To confirm the cart is cleared

def menu():
    cart = []
    while True:
        print("\nWelcome to Jessica's E-Store!")
        print("1. View Products")
        print("2. Add to Cart")
        print("3. Remove from Cart")
        print("4. View Cart")
        print("5. Checkout")
        print("6. Exit")
        choice = input("Choose an option: ")

        if choice == '1':
            view_products()
        elif choice == '2':
            product_name = input("Enter the product name to add to cart: ")
            add_to_cart(cart, product_name)
        elif choice == '3':
            product_name = input("Enter the product name to remove from cart: ")
            remove_from_cart(cart, product_name)
        elif choice == '4':
            view_cart(cart)
        elif choice == '5':
            checkout(cart)
        elif choice == '6':
            print("Thank you for visiting Jessica's E-Store!")
            break
        else:
            print("Invalid option. Please choose again.")

# Run the menu
menu()


