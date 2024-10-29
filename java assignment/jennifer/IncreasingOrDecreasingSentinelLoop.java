import java.util.Scanner;
public class IncreasingOrDecreasingSentinelLoop {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
       int count =-1;
    do{

	System.out.println("Enter first number(-1 to quit):");
          int number = input.nextInt();
   	
        
         System.out.println("Enter first number(-1 to quit):");
          int number1 = input.nextInt();
   
          System.out.println("Enter second integer(-1 to quit):");
           int number2 = input.nextInt();
   
         System.out.print("Enter third integer(-1 to quit):");
           int number3 = input.nextInt();

         if (number1>number2 && number2>number3){
         System.out.println("decreasing order");
}
    else if (number1<number2 && number2<number3){
    System.out.println("increasing order");
}
       

  System.out.print("do you wish to continue (press 1 to continue ,press -1 to stop):");
         count = input.nextInt();
} while(count != -1);
    
    }
        
}
        