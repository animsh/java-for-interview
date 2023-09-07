public class Main {
    public static void main(String[] args) {
        Calculate calculateAddition = (x, y) -> x + y;
        Calculate calculateSubstraction = (x, y) -> x - y;
        Calculate calculateMultiplication = (x, y) -> {
            System.out.println("Inside multiplication lambda expression.");
            return x * y;
        };

        System.out.println(calculateAddition.calculate(4, 5));
        System.out.println(calculateSubstraction.calculate(4, 5));
        System.out.println(calculateMultiplication.calculate(4, 5));

        NumberProvider numberProvider = () -> Math.round(Math.random() * 10);
        System.out.println(numberProvider.generate());

        double result1 = execute(4, 5, calculateAddition);
        double result2 = execute(4, 5, calculateSubstraction);
        double result3 = execute(4, 5, calculateMultiplication);
        double result4 = execute(20, 2, new CalculateImpl());

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
    }

    public static double execute(int a, int b, Calculate calculate) {
        return calculate.calculate(a, b);
    }
}
