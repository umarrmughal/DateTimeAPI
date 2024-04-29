import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First date(YYYY-MM-DD): ");
        String firstDateInput = sc.nextLine();
        LocalDate firstdate = LocalDate.parse(firstDateInput,DateTimeFormatter.ISO_DATE);
        
        System.out.println("Enter second date(YYYY-MM-DD): ");
        String seconddateinput = sc.nextLine();
        LocalDate seconddate = LocalDate.parse(seconddateinput,DateTimeFormatter.ISO_DATE);

        long daysBetween = ChronoUnit.DAYS.between(firstdate, seconddate);
        System.out.println("The Different between Two dates is: " + daysBetween + "days. ");
    }
}