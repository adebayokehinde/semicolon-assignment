import java.util.scanner
 public class SumDigit {
   public static void main(String[] args) {
   Scanner input = new scanner(System.in);

   System.out.print("Enter a number between 0 and 1000:");
   int number = input.nextnextInt();

   int sum = 0;

   while (number > 0) {
     sum +  number % 10;
      number /= 10;
      number /= 10;
    }
     System.out.println("The sum of the digits is " + sum);
}

}

