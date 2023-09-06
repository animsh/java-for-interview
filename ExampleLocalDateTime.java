import java.time.LocalDateTime;

public class ExampleLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.of(2001, 8, 7, 6, 4, 30);
        LocalDateTime l3 = LocalDateTime.parse("2001-08-07T06:07:20");

        System.out.println(l1 + " " + l2 + " " + l3);
    }
}
