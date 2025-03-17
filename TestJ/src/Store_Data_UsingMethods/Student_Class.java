package Store_Data_UsingMethods;

public class Student_Class {
	int No;
	String Name;
	char ID;
	
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
}
