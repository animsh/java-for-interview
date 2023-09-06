import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class ExampleFormatting {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(dateTimeFormatter.format(now));
        System.out.println(dateTimeFormatter.format(today));

        LocalDate localDate = LocalDate.parse("06 September 2023", dateTimeFormatter);
        System.out.println(localDate);
        System.out.println(localDate.format(DateTimeFormatter.ISO_WEEK_DATE));

        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatterBuilder.appendLiteral("The date is: ")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .toFormatter();

        System.out.println(localDate.format(dateTimeFormatter2));
    }
}
