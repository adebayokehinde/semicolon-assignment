import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("how many student do you hava: ");
        int numberofstudent = scanner.nextInt();

        System.out.print("how many subject do they offer: ");
        int numberofsubject = scanner.nextInt();

        System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>\nsaved successfully");
        



        int[][] scores = new int[numberofstudent][numberofsubject];

        for (int i = 0; i < numberofstudent; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ":");
            for (int j = 0; j < numberofsubject; j++) {
                while (true) {
                    System.out.print("Subject " + (j + 1) + ": ");
                    int score = scanner.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[i][j] = score;
                        break;
                    } else {
                        System.out.println("Score must be between 0 and 100. Please enter again.");
                    }
                }
            }
        }


    


