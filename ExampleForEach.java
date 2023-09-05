public class ExampleForEach {
    public static void main(String[] args) {
        String[] names = { "Supra", "Tata", "Mahindra" };

        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }
        System.out.println(sum);
    }
}
