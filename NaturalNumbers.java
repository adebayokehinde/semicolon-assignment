import java.util.Scanner;

public class AdditionOfNumbers {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

   System.out.print("Enter numbers of natural numbers: ");
   int number = Scanner.nextInt();
   int sum = 0;
   for (int i = 1; i <= number; i++) {

        sum = sum + 1;
    }
     System.out.println("Sum: " + sum);
     }
}