import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a date and time (yyyy-MM-dd HH:mm): ");
        String dateTimeInput = s.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeInput);

        System.out.print("Enter the source time zone (e.g., UTC): ");
        String sourceTimeZoneInput = s.nextLine();
        ZoneId sourceTimeZone = ZoneId.of(sourceTimeZoneInput);

        ZonedDateTime sourceZonedDateTime = ZonedDateTime.of(localDateTime, sourceTimeZone);

        ZoneId targetTimeZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(targetTimeZone);

        System.out.println("Date and time in target time zone: " + targetZonedDateTime);
        s.close();
    }
}