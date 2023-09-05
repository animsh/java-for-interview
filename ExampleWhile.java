public class ExampleWhile {
    public static void main(String[] args) {
        boolean notFound = true;
        while (notFound) {
            int number = (int) (Math.random() * 11);
            System.out.println("Value: " + number);
            if (number == 10) {
                notFound = false;
            }
        }
    }
}
