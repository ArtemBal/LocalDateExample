import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int days = 10;
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate + " - Current date without format");
        LocalDate pastDate = currentDate.minusDays(days);
        System.out.println(pastDate + " - Minus 10 days");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String result = pastDate.format(formatter);
        System.out.println(result + " - Output with formatter");

        int hours = 7;
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime + " - Current time without formatter");
        LocalTime futureTime = currentTime.plusHours(hours);
        System.out.println(futureTime + " - Time in 7 hours");

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh.mm.ss");
        String timeResult = futureTime.format(timeFormatter);
        System.out.println(timeResult + " - Time in 7 hours with formatter");
    }
}