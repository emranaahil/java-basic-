package Testjj;

public class Array {
	public static void main(String[]arg){
	
		//approach 1
		//Declare an array
		
		
		int a[]= new int [6]; //0-5 row (this is fixed)
		 //assign 
		a[0]=5;
		a[1]=1;
		
		//approach 2
		//Declare and assign in single line (this is not fixed)
		int b[]= {5,1,6}; //0-2 
		
		
		//Print Lenth of array 
		// System.out.print("Length of array "+b.length);
		 
		 
		 //read sngle value of index of array
		// System.out.print("Length of array "+b[1]);
		
		
		//read all array value
		//using for loop when know the array length
		//for(int i=0; i<=2; i++)
		//System.out.println("Length of array "+b[i]);
		
		//using for loop when dont know the array length
		///for(int i=0; i<=b.length-1; i++) /// i<=4 or i=5 or i=a.lenth-1 or i<a.lenth
	//	System.out.println("Length of array "+b[i]);
		
	//using for enhanced loop 
		for(int x:b)
		System.out.println(x);
		
	}

}
