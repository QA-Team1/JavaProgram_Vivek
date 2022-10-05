
public class MultipleInheritance implements A,B
{

	public void display()
	{
		System.out.println(a);
	}
	
	public void show()
	{
		System.out.println(b);
	}
	
	
	public static void main(String[] args)
	{
		MultipleInheritance mi = new MultipleInheritance();
		mi.show();
		mi.display();

	}

}
