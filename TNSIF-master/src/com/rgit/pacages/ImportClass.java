//Program to show ways of importing a package
package com.rgit.pacages;
import com.rgit.oops.Kiamotors; //using import keyword <import package.class>

public class ImportClass {

	public static void main(String[] args) {
		//2 ways to access packages:
				//	1)import keyword
				//	3)fully qualified class
		
		//by using import keyword
		Kiamotors object=new Kiamotors();
		object.display();
		object.add(6, 3);
		
		System.out.println();
		
		//Using fully qualifies class
		com.rgit.oops.Kiamotors object2=new com.rgit.oops.Kiamotors();
		object2.display();
		object2.add(8, 3);		
	}
}
