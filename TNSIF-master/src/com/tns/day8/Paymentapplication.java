package com.tns.day8;
interface Rbi{
	void rules();
	void disp();
	static void disp2() {
		System.out.println("Disp2");
	}
}
interface Phonepe{
	
}
class Axis implements Phonepe, Rbi{
	public void rules() {
		System.out.println("Rules");
		
	}
	public void disp() {
		System.out.println("Disp");
	}
}
class Icici{
	
}
class Hdfc{
	
}

public class Paymentapplication {

	public static void main(String[] args) {
		Rbi obj=new Axis();
		obj.disp();
		obj.rules();
		

	}

}
