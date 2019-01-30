import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
    	String website = "http://airport.wroclaw.pl";
    	Pattern regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
    	List<String> emails = new ArrayList<>();
    
    	try {
    		URL url = new URL(website);
    		Scanner scanner = new Scanner(url.openStream(), "UTF-8");
    		
    		while(scanner.hasNextLine()) {
    			String line = scanner.nextLine();
    			Matcher m = regex.matcher(line);
    			
    		    while (m.find()) {
    		    	emails.add(m.group());
    		    }
            }
    		
    	} catch (Exception exc) {
    		System.out.println("Error: " + exc);
    	}
    	
    	System.out.println("E-mails found: " + emails.toString());
    	
    }
}
