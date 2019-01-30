import java.math.BigInteger;


public class Task8 {
    public static void main(String[] args) {
    	
    	try {
    		Integer number = 0;
    		boolean isNegative = false;
    		
    		while (!isNegative) {
    			BigInteger bigNumber = new BigInteger(Integer.MAX_VALUE + number + "");
        		isNegative = bigNumber.compareTo(BigInteger.ZERO) < 0;
        		
        		if (isNegative) {
        			System.out.println("BigInteger nie radzi sobie z liczbami wiekszymi od Integer.MAX_VALUE o " + number);
        		}
        		
        		number++;
    		}
    	} catch (Exception exc) {
    		System.out.println("Error: " + exc);
    	} 
    }
}
