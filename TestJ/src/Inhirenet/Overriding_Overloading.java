package Inhirenet;

class par1{
	void parone1(int g) {
		
		System.out.println(g);
	}
void paroneovlod(int h) {
		
		System.out.println(h);
	}
	
	
}


class par2 extends par1{
	void parone(int g) {
		
		System.out.println(g*2); //overriding same method with change in body
		
	}
void paroneovlod(int k ,int j) {//over loading change the parmerter and body 
		
		System.out.println(k+j);
	}
	
	
}


public class Overriding_Overloading {

	public void name() {
		
	}
	
}
