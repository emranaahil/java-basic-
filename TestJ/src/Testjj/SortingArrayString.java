package Testjj;

import java.util.Arrays;

public class SortingArrayString {
	public static void main(String[] args) {
	
		//int sorting
		int a[]= {200,100,50,40,50};
		
		/*
		 * System.out.print("Before sorting"); System.out.println(Arrays.toString(a));
		 * 
		 * Arrays.sort(a);//use for sorting System.out.print("After sorting");
		 * 
		 * System.out.print(Arrays.toString(a));
		 */
	//string sorting
		
		String b[]= {"Mat","Cat","Dog",};
		System.out.println("Before sorting "+Arrays.toString(b));
		Arrays.sort(b);
		System.out.print("After sorting "+Arrays.toString(b));
	}

}
