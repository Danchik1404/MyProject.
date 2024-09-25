import java.io.File;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:/Users/ASUS/Downloads/images.jpg");
        long fileSize = file.length();
        System.out.println("File size: " + fileSize + " bytes");
    }
}
