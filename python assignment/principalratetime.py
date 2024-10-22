print('Welcome to FinTech company where your loan is granted with less intrest ')
principle = float(input('Enter the principal amount:'))
rate = int(input('Enter the annual intrest rate:')
year = int(input('enter the duration:'))
p = principle
r = (rate)/12
n = year * 12
m = (p*(r * (1 + r)**n))/ (1 + r)**n -1

print('your monthly payment is $',m)