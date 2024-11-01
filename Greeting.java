import java.util.Scanner;
public class Greeting {
   public static void main (String[] args) {
   Scanner scan = new Scanner(System.in);

   System.out.println("can i greet you press:\n1.to get gteeting\n2.to shut you up");
   
   int answer = Scanner.nextInt();

   switch(answer) {
   
   case 1:
   System.out.println("hello there");
   break;
 
   case 2:
   System.out.println("okey then, bye");
   break;
}
 }
}
   