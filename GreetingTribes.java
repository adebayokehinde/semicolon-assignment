import java.util.Scanner;
public class GreetingTribes {
   public static void main (String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("can i greet \nchoose one option press:\n1. English\n2. Yoruba\n3. igbo");
   
   int greetingtribe = input.nextInt();

   switch(greetingtribe) {
   
   case 1:
   System.out.println("hello there");
   break;
 
   case 2:
   System.out.println("e ka ro");
   break;

    case 3:
   System.out.println("otutuoma");
   break;
}
 }
}
   