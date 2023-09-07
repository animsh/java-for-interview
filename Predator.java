public interface Predator {
    void catchAndEat();

    default void eat(Prey prey) {
        System.out.println("Eating: " + prey.getClass().getName());
    }
}
