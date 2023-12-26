package methods;
public class method{
	    // Method without return type and without parameters
	    public void greet() {
	        System.out.println("Hello, World!");
	    }

	    // Method with return type and without parameters
	    public String getGreeting() {
	        return "Hello, World!";
	    }

	    // Method with return type and with parameters
	    public int addNumbers(int a, int b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        // Create an object of the class to call the methods
	        method test = new method();

	        // Call the method without return type and without parameters
	        test.greet();

	        // Call the method with return type and without parameters
	        String greeting = test.getGreeting();
	        System.out.println(greeting);

	        // Call the method with return type and with parameters
	        int sum = test.addNumbers(5, 10);
	        System.out.println("The sum is: " + sum);
	    }
	}