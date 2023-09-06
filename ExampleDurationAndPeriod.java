import java.time.Duration;
import java.time.Period;

public class ExampleDurationAndPeriod {
    public static void main(String[] args) {
        Duration d1 = Duration.ofNanos(100000000);
        Duration d2 = Duration.ofDays(7);

        System.out.println(d1 + " " + d2);

        Period p1 = Period.of(10, 8, 9);
        Period p2 = Period.ofWeeks(12);

        System.out.println(p1 + " " + p2);
    }
}
