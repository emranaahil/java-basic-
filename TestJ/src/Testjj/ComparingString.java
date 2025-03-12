package Testjj;

import java.util.Scanner;

public class ComparingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Different for equal and == methods
		//==  always use to object    
		//.equals always use to compare values of objects  
	//With variable
		String a="Hello"; // this is a variable 
//		String b="Hello"; // this is a variable 
//		System.out.print(a==b);//this will compare object  and return true
//		System.out.println(a.equals(b));//this will compare the value and return true
		
	////With Object 
		String c= new String("Hello"); //this is an object
//		String d= new String("Hello"); // this is an object
//		System.out.println(c==d);//this will compare object and return false
//		System.out.println(c.equals(d));//this will compare the object or variable value and return true

		//With object and variable
//		String a="Hello"; // this is a variable 
//		String d= new String("Hello");//this is an object
//		System.out.println(a==d);//this will compare object and return false
//		System.out.println(a.equals(d));//this will always use to compare values of objects  return true					
		
		///With object, variable and assign variable to object
//		String d=c;
//		System.out.println(a==c);//this will compare object and return false
//		System.out.println(a.equals(c));//this will always use to compare values of objects  return true
//		System.out.println(c==d);//this will compare object and return false
//		System.out.println(d.equals(c));//this will always use to compare values of objects  return true
//		System.out.println(a==d);//this will compare object and return false
//		System.out.println(a.equals(d));//this will always use to compare values of objects  return true
		
		//String is Palindrome or not
		//https://www.youtube.com/watch?v=8BlUi4-4N4E
		//	Remove junk or special characters from string
		//https://www.youtube.com/watch?v=x0SghWs1bsE
		
//		String s="Helo@Hey@#$%";
//		String r =s.replaceAll("[^a-zA-z0-9]", "");//^char
//	
//		System.out.println(r);
		
		//Count Occurrences of a Character in a String
		//https://www.youtube.com/watch?v=jbGxTi0bi7c
//		String k="How are you";
//		int count =k.length();
//		int countafterremoving = k.replace("o", "").length();
//		int totaloccurens= count-countafterremoving;
//		System.out.println(totaloccurens);
		
		//Count the words in string
		//https://www.youtube.com/watch?v=dTWfNdfpr_g
//		
	}

}
