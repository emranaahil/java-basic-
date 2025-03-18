package Store_Data_UsingMethods;

public class Main_Studuent_Class {
	public static void main(String[] args) {
		
		//OBJECT OF STUDENT CLASS
		Student_Class SC= new Student_Class();
		
		//using method to pass data
		SC.SetDataS(10, "Test" , 'A');
		//as
		//print using student class method
		SC.GetStudent();
	}   

}
