package Constructors;

public class Student {
	String name;
	int rno;
	//we have return constructor with the same name
	Student()//Constructor Without Arguments
			//Default Constructor
	{
	
		name="pradeep";
		rno=635732;
	}
	//constructor with argument
	Student(String str,int n)//Parametarized Constructor
	{
		name = str;
		rno=n;
	}
	
	//we have not return any constructor 
	public static void main(String args[])
	{
		
		Student s1= new Student();//Default Constructor
		//creating second object with parametarized constructor
		Student s2 = new Student("deepu",234682);//parametarized constructor
		System.out.println(s1.name);
		System.out.println(s1.rno);
		System.out.println(s2.name);
		System.out.println(s2.rno);
		
	}

}
