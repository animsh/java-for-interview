public class Cat extends Animal {

    public static String type = "Cat";

    @Override
    void canEat() {
        System.out.println("Cat Eating...");
    }

    void canEat(String food) {
        System.out.println("Cat is eating " + food);
    }
}
