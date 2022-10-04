
public class Paint   
{
	final float COVERAGE = 350; // 1 unit of paint can cover 350 square-feet area. 
	
	public float amount(Shapes s)
	{
		System.out.println("Computing amount of paint needed for " +s.toString());
		
		return (s.area()/COVERAGE);
		
	}
	

	
}
