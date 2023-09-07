public class ThrowingExceptions {
    public static void main(String[] args) {
        divide(2, 0);
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by 0");
        }

        System.out.println(a / b);
    }
}