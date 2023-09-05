
public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Hii";
        String s2 = s1;

        s1 = "Hello";
        System.out.println(s1 + " " + s2);
    }
}
