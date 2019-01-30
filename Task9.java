import java.util.Scanner;


public class Task9 {
    public static void main(String[] args) {
    	mathHelper perimeter = (a) -> { return 2 * Math.PI * a; };
    	mathHelper area = (a) -> { return Math.PI * Math.pow(a, 2); };
    	mathHelper sphere = (a) -> { return 4 * Math.PI * Math.pow(a, 2); };
    	mathHelper volume = (a) -> { return 4 / 3 * Math.PI * Math.pow(a, 3); };

    	System.out.println("Podaj r... :-)");
    	Scanner in = new Scanner(System.in);
    	int radius = in.nextInt();
    	
    	System.out.println("Pole kola = " + area.calculate(radius) + "; Obwod kola = " + perimeter.calculate(radius));
    	System.out.println("Powierzchnia kuli = " + sphere.calculate(radius) + "; Objetosc kuli = " + volume.calculate(radius));
    }
    
    @FunctionalInterface
    public interface mathHelper {
       double calculate(double a);
    }
}



