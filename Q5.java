import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the event start date and time: ");
        System.out.println("year");
        int year = sc.nextInt();
        System.out.println("month");
        int month = sc.nextInt();
        System.out.println("day");
        int day = sc.nextInt();
        System.out.println("hour");
        int hour = sc.nextInt();
        System.out.println("minute");
        int minute = sc.nextInt();
        LocalDateTime eventStart = LocalDateTime.of(year, month, day, hour, minute);
        System.out.println("Enter the event end date and time: ");
        int year1 = sc.nextInt();
        System.out.println("month");
        int month1 = sc.nextInt();
        System.out.println("day");
        int day1 = sc.nextInt();
        System.out.println("hour");
        int hour1 = sc.nextInt();
        System.out.println("minute");
        int minute1 = sc.nextInt();
        LocalDateTime eventEnd = LocalDateTime.of(year1, month1, day1, hour1, minute1);

        Duration duration = Duration.between(eventStart, eventEnd);

        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;

        System.out.println("Event duration: " + hours + " hours and " + minutes + " minutes");
        sc.close();
    }
}