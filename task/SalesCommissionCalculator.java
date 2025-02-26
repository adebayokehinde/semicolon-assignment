import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weeklyBase = 200.00;
        double commissionRate = 0.09;
        double totalSales = 0.0;
        double itemPrice;

        System.out.println("Enter the prices of the items sold by the salesperson (enter -1 to finish):");

        while (true) {
            System.out.print("Enter item price: ");
            itemPrice = input.nextDouble();

            if (itemPrice == -1) {
                break;
            }

            totalSales += itemPrice;
        }

        double earnings = weeklyBase + (commissionRate * totalSales);

        System.out.printf("The salesperson's earnings for the week is: $%.2f%n", earnings);
    }
}

