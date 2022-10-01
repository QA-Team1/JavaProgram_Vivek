package problem6;

public class Shape 
{

	void displayShape()
	{
		System.out.println("This is shape.");
	}
	
	public static void main(String[] args)
	{
		Square sq = new Square();
		 sq.displayShape();
		 sq.displaySquare();
		 sq.displayRectangle();
		
	}
}
