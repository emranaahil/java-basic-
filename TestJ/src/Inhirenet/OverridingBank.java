package Inhirenet;


class Bank{
	double roi(){//this should not be change {
		return 0;
	}
}


class SBI extends Bank{
	double roi() {
		return 9.5;
	}
}

class HDFC extends Bank{
	double roi() {
		return 11;
	}
}

class ICICI extends Bank{
	double roi() {
		return 8.1;
	}
}




public class OverridingBank {

	public static void main(String[]args) {
		
		SBI sb=new SBI();
		System.out.println(sb.roi()); 
		HDFC hd=new HDFC();
		
	}
}
