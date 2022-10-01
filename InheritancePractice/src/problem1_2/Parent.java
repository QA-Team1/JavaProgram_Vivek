package problem1_2;

/*
1. Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class".
 Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/


public class Parent {

	 void show()
	{
		System.out.println("This is a Parent Class.");
	}
	public static void main(String[] args) {
		
		Parent p = new Parent();
			p.show();
		
		Child c = new Child();
			c.display();
			c.show();
		
	}

}

class Child extends Parent
{
	
	void display()
	{
		System.out.println("This is a Child class.");
	}
	
	
}
