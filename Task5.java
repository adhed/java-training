import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
    	String website = "http://airport.wroclaw.pl";
    	String signToCheck = "@";
    
    	try {
    		URL url = new URL(website);
    		Scanner scanner = new Scanner(url.openStream(), "UTF-8");
    		
    		while(scanner.hasNextLine()){
    			String line = scanner.nextLine();
    			
    			if (line.contains(signToCheck)) {
    				System.out.println(line);
    			}
            }
    		
    	} catch (Exception exc) {
    		System.out.println("Error: " + exc);
    	}
    	
    }
}
