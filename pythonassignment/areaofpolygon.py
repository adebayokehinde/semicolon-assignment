from math import tan,pi

side=int(input('Enter the side :'))
lenghtside=float(input('Enter the lenght of the sides'))

area=side*(lenghtside**2)/(4*tan(pi/side))

print('The area of the polygon is : ',area)