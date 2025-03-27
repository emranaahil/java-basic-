package KeyWords;

public class StaticKeyword {

		static int a = 10;// variables static
		 int b =100;//variables non-static
				
		static void Displays()//static method
		{
			System.out.println("Static print");
		}
		
		
		static void DisplayNonStatic()//non static method
		{
			System.out.println("Static print");
		}
		 public static void main(String[] args) {
			 System.out.println(a);//directly call the veriables  with creating objects
			 //System.out.println(b);// cant call this as it is not static
			 Displays();//directly call the veriables  with creating objects
			// DisplayNonStatic //cant call this as it is not static
		 }
}