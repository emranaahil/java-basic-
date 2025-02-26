package Testjj;

public class ArrayTwoMultiDimensional {

	public static void main(String[] args) {
		
		//approach 1
				//Declare an array  (this is fixed)
//			int a[][]= new int [3] [2];// 3cloumn 2row
//			 //assign 
//			a[0][0]= 100;
//			a[0][1]= 200;
//			a[1][0]= 300;
//			a[1][1]= 400;
//			a[2][0]= 500;
	//   	a[2][1]= 600;
		
			
			//approach 2
			//Declare and assign in single line (this is not fixed)
			
		int [][]a= { {100,200},
		             {300,400},
		             {500,600}
		};
	///Find size of array
//	System.out.println("Length of cloumn "+a.length);
//	System.out.println("Length of row "+a[0].length); // give no of column.
//	System.out.println("Single Row and Column value"+ a[0][0]);
//	System.out.println("Two Row and Single Column value"+ a[0][0] +a[0][1]);

//		for(int r=0; r<=2; r++ ) // for row
//		{
//			for(int s=0; s<=1; s++) //for cloumn
//			{
//				System.out.println(a[r][s]);
//			}
//		}
		
		
		//enhanced for loop or each loop
		
		for(int arr[]:a) /// arr will read first index and store it in x and this goes until the last index
		{
			for(int x:arr) //x will read index and print. 
				System.out.println(x);
		}
	
	}

}
