import java.util.Scanner;
   public class MultipliesOfFiveLoop {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int count =1;
    while(count <=3) {
     

     System.out.print("Enter a number");
     int number = input.nextInt();
   
     int num = 0;

     if(number % 5 ==0) {
     System.out.println("the input number is a multiple of five");

     }else{ System.out.println("the input number is not a multiple of five");
	}

     count++;
}

    }
}
     