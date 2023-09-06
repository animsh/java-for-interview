import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ExampleCalculating {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneHourFromNow = now.plus(Duration.ofHours(1));

        System.out.println(now + " " + oneHourFromNow);

        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1);
        LocalDate oneYearAgo2 = today.minus(Period.ofYears(1));

        System.out.println(today + " " + oneYearAgo + " " + oneYearAgo2);
    }
}
