import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {
        LocalDate l1 = LocalDate.now();
        LocalDate l2 = LocalDate.of(2000, 8, 5);
        LocalDate l3 = LocalDate.parse("2023-01-01");

        System.out.println(l1 + " " + l2 + " " + l3);
    }
}