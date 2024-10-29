import java.util.Scanner;
   public class DivisibleByFiveLoop {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int count =1;
     while(count <=3) {
    
     

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
       
       count++;

}
     
     


    }
}
     