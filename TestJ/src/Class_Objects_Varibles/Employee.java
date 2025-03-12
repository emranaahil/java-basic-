package Class_Objects_Varibles;

public class Employee {
	
	//Variables 
	int age;
	int epin;
	String name;
	
	//Methods
	void display()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee epin is "+epin);
		System.out.println("Employee age is "+age);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object
		
		Employee emp1=new Employee();
		emp1.age=20;
		emp1.epin=2285;
		emp1.name="Ravi";
		emp1.display();

	}

}
