import java.util.ArrayDeque;
import java.util.Deque;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Deque<String> programmingLanguages = new ArrayDeque<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C#");

        System.out.println(programmingLanguages);

        programmingLanguages.pop();
        System.out.println(programmingLanguages);
        programmingLanguages.addFirst("Java");
        programmingLanguages.addLast("kotlin");
        System.out.println(programmingLanguages);
    }
}
