number = int(input('Enter days late: '))

if number <=5:
	print('fine is 50 paise')
if number >=6 and number<=10:
	print('fine is one rupees,')
if number  >=10 and number<=30:
	print('fine is 5 rupees: ')
if number   > 30:
	print('membership is cancelled: ')