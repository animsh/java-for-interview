public class App {
    public static void main(String[] args) {
        try {
            print("Hola Amigos!");
        } catch (WrongInputException e) {
            System.out.println(e);
        }
    }

    public static void print(String message) throws WrongInputException {
        if (message.length() < 6) {
            System.out.println(message);
        } else {
            throw new WrongInputException("Input string should have length less than 6!");
        }
    }
}
