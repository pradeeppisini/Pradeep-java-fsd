package package1;

public class B {
	public void mB() {
		A a = new A();
		
		a.x1=55;
		a.x2=55;
		a.x3=55;
		
		
		//compiler error
		//Because private class can not be 
		//accessed in other class
		//a.x4=55;
		
		a.mA();
		
	}
}
