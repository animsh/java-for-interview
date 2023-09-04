public class App {
    public static void main(String[] args) {
        Person person = new Person();
        Person p = person;

        person.name = "Maaike";
        System.out.println(p.name);
        System.out.println(person.name);
    }
}
