import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime l1 = ZonedDateTime.now();
        ZonedDateTime l2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));

        System.out.println(l1 + " " + l2);
    }
}
