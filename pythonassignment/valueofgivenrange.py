lower=int (input("Enter lower range limit:"))

upper=int (input("Enter upper range limit:"))

num=int (input("Enter the number to be divided by:"))

for k in range(lower,upper+1):
   if(k%num==0):
       print(k)
