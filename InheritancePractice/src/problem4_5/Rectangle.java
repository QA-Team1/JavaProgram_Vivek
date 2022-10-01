package problem4_5;

public class Rectangle 
{

	int length;
	int breadth;
	
	public Rectangle(int l, int b)
	{
		
		length = l;
		breadth = b;
	}
	
	public void printArea()
	{
		System.out.println("Area : " +length*breadth);
	}
	
	public void printPerimeter()
	{
		System.out.println("Perimeter: " +2*(length+breadth));
	}
	
	public static void main(String[] args)
	{
		
		Rectangle r = new Rectangle(10,15);
		r.printArea();
		r.printPerimeter();
		
		
		System.out.println();
		
		
		Square[] s1 = new Square[10];
		int i = 5;
		for (int j = 0; j<10; j++)
		{
			s1[j] = new Square(i);
			i=i+2;
		}
		
		for(int k= 0; k<10; k++) {
			System.out.println("Square " +(k+1) );
			s1[k].printArea();
			s1[k].printPerimeter();
			System.out.println();
			
		}
	}
}
