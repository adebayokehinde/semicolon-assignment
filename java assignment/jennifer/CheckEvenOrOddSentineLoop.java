import java.util.Scanner;
   public class CheckEvenOrOddSentineLoop {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int count = -1;
   do{
      
     
     System.out.print("Enter a number");
     int number = input.nextInt();
   
     int num = 0;

     if(number % 2 ==0) {
     System.out.println("the input number is an even number");

     }else{ System.out.println("the input number is an odd number");
}
     System.out.print("do you wish to continue (press 1 to continue ,press -1 to stop):");
         count = input.nextInt();
} while(count != -1);

    }
}
     