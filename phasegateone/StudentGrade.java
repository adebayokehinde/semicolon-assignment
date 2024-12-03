import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("how many student do you hava: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("how many subject do they offer: ");
        int numberOfSubjects = scanner.nextInt();

        System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>\nsaved successfully");
        



        int[][] scores = new int[numberOfStudents][numberOfSubjects];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ":");
            for (int j = 0; j < numberOfSubjects; j++) {