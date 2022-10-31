package com.rgit.oops;

class Sample{
	public void add(int a, int b) {
		System.out.println("Sum is "+(a+b));
	}
	public void add(int a, int b,int c) {
		System.out.println("Sum is "+(a+b+c));
	}
	public void add(int a, int b,int c, int d) {
		System.out.println("Sum is "+(a+b+c+d));
	} 										//Polymorphism(5):same object can be used in many ways.
}											//Two types of polymorphism: Overloading, overriding

public class Kiamotors extends Sample 
{					
											//Class(1):blueprint of the program
											//Encapsulation(3):binding data into single unit
	int nocars;
	String model, color;
	
	public void display() {
		super.add(5,7,3);					//Inheritance(6):acquiring properties from the parent or super class
		int speed=50; 						//Abstraction(4):Displaying only the essential features, and hiding the non-essential data
		System.out.println("Welcome to Kiamotors");
		System.out.println("Speed(="+speed+") can only be used here"); 
	}
//	private void privateDisplay() {
//		System.out.println("Private");
//	}
//	protected void protectedDisplay() {
//		System.out.println("Protected");
//	}
	
	public static void main(String[] args) {
		Kiamotors ob1=new Kiamotors();
		ob1.display();						//Object(2):instance of a class
		
		Sample sob=new Sample();
		sob.add(3, 4);
		sob.add(7, 4, 3);
		sob.add(5,6,3,4);	//Function Overloading
	}
}
