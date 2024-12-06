import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        System.out.print("Enter your average cycle length (in days): ");
        int cycleLength = scanner.nextInt();


        System.out.print("Enter the start date of your last menstrual period (dd-MM-yyyy): ");
        String lmpInput = scanner.next();
        LocalDate lastMenstrualPeriod = LocalDate.parse(lmpInput, dateFormatter);


        System.out.print("Enter your average flow duration (in days): ");
        int flowDuration = scanner.nextInt();

        LocalDate nextPeriodStart = lastMenstrualPeriod.plusDays(cycleLength);
        LocalDate nextPeriodEnd = nextPeriodStart.plusDays(flowDuration - 1);


        LocalDate ovulationDate = nextPeriodStart.minusDays(14);

 
        LocalDate safeStart1 = lastMenstrualPeriod.plusDays(flowDuration);
        LocalDate safeEnd1 = ovulationDate.minusDays(1);
        LocalDate safeStart2 = ovulationDate.plusDays(1);
        LocalDate safeEnd2 = nextPeriodStart.minusDays(1);

        System.out.println("\n--- Menstrual Cycle Details ---");      
        System.out.println("Next Period Start Date: " + nextPeriodStart.format(dateFormatter));
        System.out.println("Next Period End Date: " + nextPeriodEnd.format(dateFormatter));
        System.out.println("Ovulation Date: " + ovulationDate.format(dateFormatter));
        System.out.println("Safe Periods: ");
        System.out.println("  From " + safeStart1.format(dateFormatter) + " to " + safeEnd1.format(dateFormatter));
        System.out.println("  From " + safeStart2.format(dateFormatter) + " to " + safeEnd2.format(dateFormatter));

        scanner.close();
    }
}
