public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.canEat();
        cat.canEat();
        cat.canEat("meat");

        System.out.println(Dog.type);
        System.out.println(Cat.type);
    }
}
