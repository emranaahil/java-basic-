package Testjj;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReadAndWriteDataIntoArray {
	//Storing Array in different position
	public static void main(String[] args) {
		
	int a[]= new int[5];
	
Scanner sc= new Scanner(System.in);
	
	for(int i=0; i< a.length; i++)
	{
		System.out.println("Enter a Number for postion "+i+" : "); //ask for value 
		a[i]=sc.nextInt();//store the give value 
	}
	
	System.out.print("Array stored");
	
	System.out.println(Arrays.toString(a));
//

	

	
	}
	
}
