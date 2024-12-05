import java.util.Scanner;
public class Mbti  {
 
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print.("Enter your name");
	String name = input.nextLine();

        String[][] questions = {
            {" A. Expend energy, enjoy groups"," B. Conserve energy, enjoy one-on-one"},
            {" A. Interpret literally"," B. look for meaning and possibilities"},
            {" A. logical, thinking, questioning"," B. empathetic, feeling, accommodating"},
            {" A. organized, orderly"," B. flexible, adoptable"},
            {" A. more outgoing, think out loud"," B. more reserved, think to yourself"},
            {" A. practical, realistic, experiential"," B. imaginative, innovative, theoretical"},
	    {" A. candid, straight foward, frank"," B. tactful, kind, encouraging"},
            {" A. plan, schedule"," B. unpllaned, spontaneous"},
	    {" A. seek many task, public activities, interaction with others"," B. seek private, solitary activities with quiet to concentrate"},
	    {" A. standard, usual, conventional"," B. different, novel, unique"},
	    {" A. firm, tend to criticize, hold the line"," B. gentle, tend to appreciate, conciliate"},
	    {" A. regulated, structured", "B. easy-going, live and let live"},
	    {" A. external, communicative, express yourself"," B. internal,reticent, keep to yourself"},
	    {" A. focus on here-and-now","B. look to the future, global perspective, big picture"},
            {" A. tough-minded, just"," B. tender-hearted, merciful"},
            {" A. preparation, plan ahead"," B. go with the flow, adapt as you go"},
            {" A. active, initiate"," B. reflective, deliberate"},
            {" A. tough-minded, just"," B. tender-hearted, merciful"},
            {" A. preparation, plan ahead"," B. go with the flow, adapt as you go"},
            {" A. active, initiate"," B. reflective, deliberate"},
            {" A. facts things what is"," B. ideas dreams, what would be, philosophical"},
            {" A. matter of fact issue-oriented"," B. sensitive, people-oriented, compassionate"},
            {" A. control, govern"," B. latitude, freedom"}};

        int[] counts = new int[4];
		int i = 0;
	
        for (int count = 0; i < 4; i++) {
            int counter = 0;
	    int	optioncounts = 0;
            for (int j = i; j < 20; j += 4) {
 
                System.out.print(questions[j][0] + " " + questions[j][1] + "\nSelect A or B: ");
                String response = "a";
                    response = input.next();
                    if (response.equalsIgnoreCase("A") || response.equalsIgnoreCase("B")) {
                        break;
                    } else {

           }if (response.equalsIgnoreCase("A")) {
                    counter++;
                }
            }
            counts[count] = counter;
            System.out.println("The number of A selected is: " + count);
            System.out.println("The number of B selected is: " + (5 - count));
            System.out.println();
        }

        String myMbti type =
            (counts[0] > 2 ? "E" : "I") +
            (counts[1] > 2 ? "S" : "N") +
            (counts[2] > 2 ? "T" : "F") +
            (counts[3] > 2 ? "J" : "P");

        System.out.println(name + "Your MBTI type is: " + myMbtiType);
	System.out.println();
	
        switch (myMbti) {

            case "ENTJ":
                System.out.println("ENTJ (Commander) is a personality type with the Extroverted, Intuitive, Thinking, and Judging traits. Bold and imaginative, they are strong-willed leaders who enjoy organizing and directing people and projects.");
                break;

	    case "ENFJ":
                System.out.println("ENFJ (Protagonist) is a personality type with the Extroverted, Intuitive, Feeling, and Judging traits. They are charismatic and inspiring leaders, often driven to help others realize their potential.");
                break;
	    
	    case "ESTJ":
                System.out.println("ESTJ (Executive) is a personality type with the Extroverted, Sensing, Thinking, and Judging traits. Organized and driven, they focus on results and managing tasks efficiently.");
                break;

	    case "INFJ":
                System.out.println("INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");
                break;

            case "ISFP":
                System.out.println("ISFP (Adventurer) is a personality type with the Introverted, Sensing, Feeling, and Prospecting traits. Creative and spontaneous, they value freedom and often express themselves through art and other forms of creativity.");
                break;


 

	    