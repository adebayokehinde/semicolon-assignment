import java.util.Scanner;
   public class CheckEvenOrOddLoop {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int count =1;
    while(count <=3) {
     

     System.out.print("Enter a number");
     int number = input.nextInt();
   
     int num = 0;

     if(number % 2 ==0) {
     System.out.println("the input number is an even number");

     }else{ System.out.println("the input number is an odd number");
	}

     count++;
}

    }
}
     