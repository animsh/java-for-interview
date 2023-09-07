public class Fox extends Mammal implements Prey, Predator {

    @Override
    public void catchAndEat() {
        System.out.println("Catch and eat prey...");
    }

    @Override
    public void runAndHide() {
        System.out.println("Run and hide from predator...");
    }
}
