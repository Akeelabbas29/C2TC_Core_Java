//Program to show Hierarchical inheritance
package com.rgit.inheritance;

class HParent{
	void display() {
		System.out.println("Parent");
	}
}
class ChildOne extends HParent{
	void display() {
		System.out.println("Child One");
	}
}
class ChildTwo extends HParent{
	void display() {
		System.out.println("Child Two");
	}
}
class ChildThree extends HParent{
	void display() {
		System.out.println("Child Three");
	}
}
public class Hierarchical extends HParent{

	public static void main(String[] args) {
		//Hierarchical inheritance is when multiple child classes inherits properties from single parent class
		Hierarchical ob1=new Hierarchical();
		ob1.display();
		ChildOne ob2 =new ChildOne();
		ob2.display();
		ChildTwo ob3 =new ChildTwo();
		ob3.display();
		ChildThree ob4 =new ChildThree();
		ob4.display();
	}
}
