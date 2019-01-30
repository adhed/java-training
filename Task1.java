import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
    	URL fileUrl = Task1.class.getClassLoader().getResource("dane1.txt");
      	String filePath = fileUrl.getPath();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
      
      
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}