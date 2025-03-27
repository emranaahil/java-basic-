package Store_Data_UsingMethods;

public class Student_Class {
	int No;
	String Name;
	char ID;
	
	///for default constructor
	int a;
	int b;
	//METHOD TO STORE DATA INTO VARIABLES
	
	void SetDataS(int GiveNo, String GiveName, char GiveID)
	{
		No=GiveNo;
		Name=GiveName;
		ID=GiveID;
	}
	
	//METHOD TO PRINT DATE
	void GetStudent() {
		System.out.println(No+" "+Name+" "+ID);
	}
	//Create a paramertrize Constructor
//	Student_Class(int SGiveNo, String SGiveName, char SGiveID)
//	{
//		No=SGiveNo;
//		Name=SGiveName;
//		ID=SGiveID;
//	}
	void ADDStudent() {
		System.out.println(a+b); }
	//Default constructor
	Student_Class()
	{
		a=100;
		b=200;
	}
	
	
}
