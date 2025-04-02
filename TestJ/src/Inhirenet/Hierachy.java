package Inhirenet;

//One parent have multiple child 
class parent {
	
	
	void Parent(int pa) {
		System.out.println(pa);
	}
}
//parent extends
class child1 extends parent{
	
	void Child(int ch1) {
		System.out.println(ch1);
}
}
//parent extends
	class child2  extends parent{
		
		void Child2(int ch2) {
			System.out.println(ch2);
	}
	}
public class Hierachy {
	public static void main(String[] args) {
		
		child1 c1=new child1();
		c1.Parent(50);//user Parent method
		c1.Child(101);//user child method
		
		child2 c2= new child2();
		c2.Child2(001);//user child method
		c2.Parent(2);//user Parent method
	}
	}
		
