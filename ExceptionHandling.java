import java.io.File;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String[] args) {
        // try {
        // File file = new File("not.txt");
        // FileReader fileReader = new FileReader(file);

        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // } finally {
        // System.out.println("will run without getting affected from above code!");
        // }
        File file = new File("not.txt");
        try (FileReader fileReader = new FileReader(file)) {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Done!");
    }
}
