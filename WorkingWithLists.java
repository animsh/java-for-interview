import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("rice");
        shoppingList.add("banana");

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(10);
        listOfNumbers.add(100);

        System.out.println(shoppingList);
        System.out.println(listOfNumbers);

        shoppingList.remove(0);
        System.out.println(shoppingList);
        boolean containsBanana = shoppingList.contains("banana");
        System.out.println(containsBanana);
    }
}
