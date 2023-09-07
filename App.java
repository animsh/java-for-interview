public class App {
    public static void main(String[] args) {
        DaysOfWeek day1 = DaysOfWeek.MONDAY;
        DaysOfWeek day2 = DaysOfWeek.SUNDAY;

        if (day1 == day2) {
            System.out.println("both are SAME days!.");
        } else {
            System.out.println("both are different days!.");
        }

        System.out.println(day1.ordinal());
        System.out.println(DaysOfWeek.values());
        System.out.println(day1.isWeekend());
        System.out.println(day2.isWeekend());
    }
}
