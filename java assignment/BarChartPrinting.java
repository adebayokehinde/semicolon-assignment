import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number between 1 and 30: ");
            int number = input.nextInt();
            
            while (number < 1 || number > 30) {
                System.out.print("Invalid input. Enter a number between 1 and 30: ");
                number = input.nextInt();
            }
            
            System.out.println("Number: " + number);
            for (int j = 1; j <= number; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}