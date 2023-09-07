import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Integer> setOfIntegers = new HashSet<>();
        setOfIntegers.add(1);
        setOfIntegers.add(10);
        setOfIntegers.add(100);
        setOfIntegers.add(10);

        System.out.println(setOfIntegers);

        for (Integer integer : setOfIntegers) {
            System.out.println(integer);
        }
    }
}
