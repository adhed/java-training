public class Task10 {
    public static void main(String[] args) {
    	TestClass testObject = new TestClass(15);
    	
    	checkType(testObject);
    }
    
    public static <T> void checkType(T object) {
    	String className = object.getClass().getSimpleName();
    	System.out.println("Nazwa klasy to: " + className);
    }
}

class TestClass {
	int value;
	
	public TestClass(int newValue) {
		value = newValue;
	}
}