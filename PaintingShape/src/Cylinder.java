
public class Cylinder extends Shapes
{
	int radius;
	int height;
	String shapeName = "Cylinder";
	
	public float area()
	{
		return PI*radius*radius*height;
	}

	@Override
	public String toString() {
		return  shapeName ;
	}
	
	
}
