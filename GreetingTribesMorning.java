import java.util.Scanner;
public class GreetingTribesMorning {
   public static void main (String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("can i greet \nchoose one option press:\n1.English\n2. yoruba\n3. igbo");
   
   int greetingtribe = input.nextInt();

   switch(greetingtribe) {
   
   case 1:
   System.out.println("select one press: \n1.morning\n2.afternoon\n3.evening");
   int greetingenglish = input.nextInt();
   
  switch(greetingenglish) {
case 1:System.out.println("1.good morning");
break;
case 2:System.out.println("2.good afternoon");
break;
case 3:System.out.println("3.good evening");
break;
 
}
break;

case 2:
 System.out.println("select one press:\n1.aro\n2.osun\n3.ale");
      
 int greetingyoruba = input.nextInt();
 switch(greetingyoruba) {
case 1:System.out.println("1.Ekaro");
break;
case 2:System.out.println("2.Ekaro");
break;
case 3:System.out.println("3.Ekaale");
  break ;
}
break;
 
case 3:
 System.out.println("select one press:\n1.otutuoma\n1.outufuoma\n1.otusoma");
  int greetingigbo = input.nextInt();
  switch(greetingigbo) {
case 1:System.out.print("1.otutuoma");
break;
case 2:System.out.print("2.otufuoma");
break;
case 3:System.out.print("3.otusooma");
break;
}
break;
}


 }
}
   