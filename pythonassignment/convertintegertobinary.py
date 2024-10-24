num=list(input('Enter an integer number: '))
result=0

for k in range(len(num)):
    digit=num.pop()
    if digit == '1':
       result=result + pow(2,k)
print('The binary value is ',result)