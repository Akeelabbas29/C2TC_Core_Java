package com.rgit.accessmodifiers;

public class Junior {

	public void func1() {
		System.out.println("Junior public function 1");
	}
	public void func2() {
		System.out.println("Junior public function 2");
	}
	public static void main(String[] args) {
		//All functions of junior class can be accessed by senior
		
		Junior jObj=new Junior();
		jObj.func1();		//public, protected and private can be accessed from inside the class
		jObj.func2();
		
		System.out.println();
		
		Senior sObj=new Senior();
		sObj.func1(); 			//public can be accessed from anywhere
		//sObj.confidential();	//private can only be accessed from inside the class
		sObj.func2(); 			//protected can be accessed from outside the class, outside the package under conditions
	}
}
