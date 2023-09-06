import java.time.LocalTime;

public class ExampleLocalTime {
    public static void main(String[] args) {
        LocalTime l1 = LocalTime.now();
        LocalTime l2 = LocalTime.of(6, 0, 1);
        LocalTime l3 = LocalTime.parse("22:24:30");

        System.out.println(l1 + " " + l2 + " " + l3);
    }
}
