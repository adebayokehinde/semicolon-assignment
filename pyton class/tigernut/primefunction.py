def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i != 0:
            return True
    return False

num = int(input("Enter a number: "))

result = is_prime(num)


if result:
    print(True)
else:
    print(False)