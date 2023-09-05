public class ExampleSwitch {
    public static void main(String[] args) {
        String fileType = "pdf";

        switch (fileType) {
            case "docx":
                System.out.println("This is word document!");
                break;
            case "pptx":
                System.out.println("This is presentation!");
                break;
            case "pdf":
                System.out.println("This is pdf file!");
                break;
            case "txt":
                System.out.println("This is text file!");
                break;
            default:
                System.out.println("We do not support this file extension!");
                break;
        }
    }
}
