public class ExamplePrimitives {
    public static void main(String[] args) {
        // byte b = 34;
        // short s = 23000;
        // int i = 45000;
        // long l = 12345678901L;

        // float f = 3.2f;
        // double d = 3.27438434;

        // char c = 'a';
        // char c1 = 45;

        // boolean b1 = true;

        // arithmatic operators
        double x = 2;
        double y = 3;
        double z = x + y;
        System.out.println(z);
        double d = x / y;
        System.out.println(d);

        int num1 = 10;
        int num2 = 4;
        int result = num1 % num2;
        System.out.println(result);

        // assignment operators
        int num3 = 7;
        int num4 = 70;
        num3 += num4;
        System.out.println(num3);
        num3 -= num4;
        System.out.println(num3);
        num3 *= num4;
        System.out.println(num3);
        num3 /= num4;
        System.out.println(num3);
        num3 %= num4;
        System.out.println(num3);

        // unary oprators
        int num5 = 8;
        num5++;
        System.out.println(num5);

        int num6 = 3;
        System.out.println(-num6);
        System.out.println(num6);

        int pre = 5;
        int post = 5;

        System.out.println(++pre);
        System.out.println(post++);
        System.out.println("post: " + post + " pre: " + pre);

        // relational operators
        int small = 2;
        int big = 5;

        System.out.println(small == big);
        System.out.println(small != big);
        System.out.println(small > big);
        System.out.println(small < big);
        System.out.println(small >= big);
        System.out.println(small <= big);
    }
}
