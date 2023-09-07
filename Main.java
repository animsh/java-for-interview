public class Main {
    public static void main(String[] args) {
        Bag<Book> bagOfBook = new Bag<>();
        Book atomicHabits = new Book();
        atomicHabits.setName("Atomic Habits");

        bagOfBook.setContent(atomicHabits);

        Bag<Laptop> bagOfLaptop = new Bag<>();
        Laptop macBookAir = new Laptop();
        macBookAir.setName("MacBook Air 15'inch");

        bagOfLaptop.setContent(macBookAir);
    }
}
