package TypeCasting;

public class ImplicitAndExplicit {
	//Implicit Conversion
	//byte>>Short>>Char>>int>>long>>float>>double
	
	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		
		int a= 5;
		
		//automatically converts the interger type to float type
		
		float b=a;
		//automatically converts the long type into double
		
		double c=b;
		
		System.out.println("Before conversion,int value a:"+a);
		System.out.println("After conversion,float value b:"+b);
		System.out.println("After conversion,double value c:"+c);
		
		System.out.println("\n");
		System.out.println("Explicit Type Casting");
		
		//Explicit Conversion
		//double>>float>>long>>int>>char>>short>>byte
		//manually converts the higher to lower DataType
		
		double x=156.34;
		
		long y = (long)x;
		
		System.out.println("Before conversion,double value x:"+x);
		System.out.println("After conversion,long value y:"+y);
	}
	

}
