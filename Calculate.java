@FunctionalInterface
public interface Calculate {
    int calculate(int a, int b);

    default void print() {
        System.out.println("Test print method in functional interface.");
    }
}