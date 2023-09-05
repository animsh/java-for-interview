public class ExampleStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", ");
        stringBuilder.append("world!");
        String s1 = stringBuilder.toString();
        System.out.println(s1);
    }
}
