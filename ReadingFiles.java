import java.io.FileReader;

public class ReadingFiles {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("file.txt")) {
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
