public class ExampleIf {
    public static void main(String[] args) {
        int number = 2;
        if (number != 0) {
            System.out.println("after dividing by 2: " + (number / 2));
        } else {
            System.out.println("Can't divide 0");
        }

        int hour = 28;

        if (hour > 0 && hour < 12) {
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good Afternoon!");
        } else if (hour >= 18 && hour < 24) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("I don't know this hour of day, but have a good day!");
        }
    }
}