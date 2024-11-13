import java.util.Scanner;

  public class TwoLargest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int counter = 1;
int firstlargest = 1;
int secondlargest =1;

while (counter <= 9) {

  System.out.println("enter ten numbers");
int numbers = input.nextInt();

   if (numbers > firstlargest) {
        firstlargest = numbers;
 }
   else if (numbers > secondlargest && numbers != firstlargest) {
        secondlargest = numbers;
}
   counter++;
}
System.out.printf("largest numbers is: %d and %d", firstlargest,secondlargest);  
}
}