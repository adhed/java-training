import java.io.FileNotFoundException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
    	URL fileUrl = Task4.class.getClassLoader().getResource("napis.txt");
        int lineToRead = 15464;
        int linesToSkip = lineToRead - 1;
        String line = "";
        
        try (Stream<String> lines = Files.lines(Paths.get(fileUrl.toURI()))) {
            line = lines.skip(linesToSkip).findFirst().get();
        } catch(Exception exc) {
        	System.out.println("error:" + exc);
        }
        
        System.out.println("Dane z wiersza nr " + lineToRead + ": " + line);
    }
}
