package Methods;

public class Methods_Class {
	
	//No parameter no return value or parameter are also call arguments
	
	void m1() //as this method not retruning any value so its void
	{
		System.out.println("Test");
	}
	
	//No parameter but return value or parameter are also call arguments
	String m2() {
		return("Test");
	}
	//Take parameter but no return value
	void m3(String Names) {
		System.out.println("hello "+Names);
	}
	//Take parameter and return value
	String m4(String Name) {
		return("Hello "+Name +" using return type");
	}
}
