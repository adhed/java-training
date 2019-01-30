
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
    	URL fileUrl = Task2.class.getClassLoader().getResource("dane1.txt");
      	String filePath = fileUrl.getPath();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
      
		// przyjmuje ze liczby sa w kolejnych liniach
      	String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
      	
      	int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
      
      	int sum = num1 + num2;
      
      	System.out.println("Suma to: " + sum);
    }
}
