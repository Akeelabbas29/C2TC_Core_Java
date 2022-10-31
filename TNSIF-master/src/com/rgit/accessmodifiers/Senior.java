package com.rgit.accessmodifiers;

public class Senior {

	public void func1() { 
		System.out.println("Senior public function");
	}
	private void confidential() {
		System.out.println("Senior confidential function");
	}
	protected void func2() {
		System.out.println("Senior protected function");
	}
	public static void main(String[] args) {
		//Few functions of senior class can be accessed by junior, and some cannot.
		
		Senior sObj=new Senior();
		sObj.func1();		//public, protected and private can be accessed from inside the class
		sObj.confidential();
		sObj.func2();
		
		System.out.println();
		
		Junior jObj=new Junior();
		jObj.func1();
		jObj.func2();		//public can be accessed by anywhere
	}
}
