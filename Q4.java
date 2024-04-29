import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a date (yyy-MM-dd)");
        String dateString = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try{
            LocalDate date = LocalDate.parse(dateString, formatter);
            System.out.println("The date is: " + date);
        } catch (DateTimeParseException e){
            System.err.println("Error parsing date: "+ e.getMessage());
        }
        sc.close();
    }
}