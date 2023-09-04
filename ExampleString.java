import java.util.Locale;

public class ExampleString {
    public static void main(String[] args) {
        String s = "hi";
        String s1 = "hello";

        System.out.println(s.toUpperCase(Locale.getDefault()));
        System.out.println(s);

        String subString = s1.substring(1, 3);
        System.out.println(subString);

        boolean startsWith = s.startsWith("h");
        System.out.println(startsWith);

        System.out.println(s1.length());
        System.out.println(s1.charAt(3));

        System.out.println(s.equals(s1));
    }
}
