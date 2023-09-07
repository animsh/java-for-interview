import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<String, Integer> nameWithAges = new HashMap<>();
        nameWithAges.put("Sagar", 22);
        nameWithAges.put("Harshal", 24);
        nameWithAges.put("Mayur", 22);

        System.out.println(nameWithAges);

        for (String key : nameWithAges.keySet()) {
            System.out.println(key);
        }

        for (Map.Entry<String, Integer> item : nameWithAges.entrySet()) {
            System.out.println(item);
        }

        nameWithAges.remove("Mayur");
        nameWithAges.put("Animesh", 22);
        System.out.println(nameWithAges);
    }
}
