//Program to show Single level inheritance
package com.rgit.inheritance;

class Parent{
	void disp() {
		System.out.println("I am from parent class");
	}
}

public class SingleLevel extends Parent {

	public static void main(String[] args) {
		//Single level inheritance is when a child class inherits properties from a single parent class
		SingleLevel ob=new SingleLevel();
		ob.disp();		//Function from parent class
	}

}
