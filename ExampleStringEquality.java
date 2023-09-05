public class ExampleStringEquality {
    public static void main(String[] args) {
        String s1 = "Hii";
        String s2 = "Hii";
        String s3 = new String("Hii");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
