import java.util.Scanner;
   public class DivisibleByFiveSentineLoop {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int count =1;
     do {
    
     

     System.out.print("Enter a number");
     int number = input.nextInt();
   
     int num = 0;

     if(number % 5 ==0) {
     System.out.println("the number is a multiple of  five ");

     }else{ System.out.println("the input number is not a multiple of five");
	}


     if(number % 11 ==0) {
     System.out.println("the input number is a multiple of eleven");

     }else{ System.out.println("the input number is not a multiple of eleven");
	}
       
       

System.out.print("do you wish to continue (press 1 to continue ,press -1 to stop):");
         count = input.nextInt();
} while(count != -1);
     
     


    }
}
     