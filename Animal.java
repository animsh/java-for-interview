public abstract class Animal {
    private int age;
    private String name;
    private int numberOfEyes;
    public static String type = "Animal";

    void canEat() {
        System.out.println("Eating...");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }
}
