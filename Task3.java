import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
    	URL fileUrl = Task3.class.getClassLoader().getResource("dane2.txt");
        String filePath = fileUrl.getPath();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        
        scanner.useDelimiter("\\Z");
        
        System.out.println(scanner.next());
    }
}
