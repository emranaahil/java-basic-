package Methods;
import Class_Objects_Varibles.*;
public class Methods_Mian {
	
	public static void main(String[] args) {
		Methods_Class MC=new Methods_Class();//calling methods form main class or different class
	
		
	MC.m1(); //use methods of main class
	String s= MC.m2();//AS THIS IS a return type so we have to store this in a variable
	System.out.println(s);
	
	MC.m3("Imran");//give value for string parameters
	String n = MC.m4("Imram");
	System.out.println(n);
	}
	
}
