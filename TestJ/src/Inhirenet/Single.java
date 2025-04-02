package Inhirenet;

class a{
	int s = 10;
	void show() {
		System.out.println(s);
	}
}

//extend a
class b extends a{
	String sg="2class";
	void show2()
	{
		System.out.println(sg);
	}
}



public class Single {
	public static void main(String[] args) {
	b ex =new b();
	System.out.println(ex.s);//use a class method 
	System.out.println(ex.sg);//use b class method

}
}
