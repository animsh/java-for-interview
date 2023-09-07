import java.io.FileWriter;

public class WritingFiles {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("out.txt", true)) {
            fileWriter.write("Second Run!\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
