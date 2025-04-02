package Inhirenet;


//miltiple level
class c{
	int s = 11;
	void show1() {
		System.out.println(s);
	}
}

//extend c
class d extends c{
	String sg="2class";
	void show2()
	{
		System.out.print(sg);
	}
	
}
	class e extends d{
		String sgh="3class";
		void show3()
		{
			System.out.print(sg);
		}
}



public class Multi_level {
	public static void main(String[] args) {
		e ee =new e();
		System.out.println(ee.s);//use c class method 
		System.out.println(ee.sg);//use d class method
		System.out.println(ee.sgh);//use d class method

	}
	
}
