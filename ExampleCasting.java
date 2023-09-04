public class ExampleCasting {
    public static void main(String[] args) {
        long l = 123;
        int x = (int) l;
        System.out.println(x);

        double d = 3.2;
        float f = (float) d;
        System.out.println(f);

        // problem
        byte b = -23;
        char c = (char) b;
        System.out.println(c);
        int i = c;
        System.out.println(i);

        char maxChar = 65535;
        char newChar = (char) (maxChar + 1);
        System.out.println((int) newChar);
    }
}
