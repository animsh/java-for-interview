public enum DaysOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    public final String fullName;
    public final int numberOfDay;

    DaysOfWeek(String fullName, int numberOfDay) {
        this.fullName = fullName;
        this.numberOfDay = numberOfDay;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}