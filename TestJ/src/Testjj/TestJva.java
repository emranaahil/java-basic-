package Testjj;

public class TestJva {
	
	public static void main(String[]arg){

	String s= "Imran";
	
	int le = s.length(); 
	
	String res = "";
	
	for(int i=le; i>=2; i++){
		
		res = res+s.charAt(i);
		
		
	}
	 System.out.print(res);
	
}
	
}
