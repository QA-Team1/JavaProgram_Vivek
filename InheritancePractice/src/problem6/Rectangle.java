package problem6;

public class Rectangle extends Shape 
{
	
	void displayRectangle()
	{
		System.out.println("This is rectangular shape.");
	}
	
}

class Square extends Rectangle
{
	
	void displaySquare()
	{
		System.out.println("Square is rectangle.");
	}
	
	
}
