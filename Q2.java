import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a time in 24 HR format (HH:mm)");
        String time24 = sc.nextLine();

        DateTimeFormatter formatter24 = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time = LocalTime.parse(time24, formatter24);

        DateTimeFormatter formatter12 = DateTimeFormatter.ofPattern("h:mm a");
        String time12 = time.format(formatter12);

        System.out.println("Time in 12 Hour format is"+ time12);
        sc.close();
    }
}