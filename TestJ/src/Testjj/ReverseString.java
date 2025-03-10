package Testjj;

public class ReverseString {

	public static void main(String[] args) {
		//Dynamic by using length and charAT
		String a="Imran";
		String rev="";
		
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			rev=rev+a.charAt(i);///charAT() store each value one by one
//		}
	
//		System.out.print(rev);
		// TODO Auto-generated method stub

		//Dynamic by without using length and charAT()(String method)
		
//		char c[]=a.toCharArray();//convert string to char array type 
		
//		for(int i=c.length-1; i>=0; i--)//read char in reverse
//			//a.length give length of variable
//		{

//			rev=rev+c[i];//store each value in reverse
			
//		}
//		System.out.print("Reverse String "+rev);
	
		//Reverse using StringBuffer and StringBuilder they are mutable(we can change the variable directly )
		
		StringBuffer s = new StringBuffer ("TEST");
		
		StringBuilder r = new StringBuilder ("TESTER");
		
		System.out.println(s.reverse());
		System.out.print(r.reverse());
	}

}
