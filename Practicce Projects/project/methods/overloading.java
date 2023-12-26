package methods;

public class overloading {
	//method overloading by changing the number of parameters
	
	void display(int a) {
		System.out.println("Argument: "+a);
	}
	void display(int a, int b) {
		System.out.println("Arguments: " + a + " and " + b);
	}
	//method overloading by changing the data type of parameters
	
	void display(String a) {
		System.out.println("Got String object: "+a);
	}
	public static void main(String[] args) {
		
		overloading obj = new overloading();
		obj.display(1);
		obj.display(1,4);
		obj.display("Hello guys");
	}

}
