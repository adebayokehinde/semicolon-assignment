import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = getValidInput(scanner);
        System.out.println("You entered a valid input: " + value);
    }

    public static int getValidInput(Scanner scanner) {
        int value;
        do {
            System.out.print("Enter 1 or 2: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
            value = scanner.nextInt();
            if (value != 1 && value != 2) {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
        } while (value != 1 && value != 2);
        return value;
    }
}
