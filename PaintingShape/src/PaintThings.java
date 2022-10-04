
public class PaintThings
{
	
	

	public static void main(String[] args) 
	{
		Paint p = new Paint();
		
		Rectangle deck = new Rectangle();
		deck.length = 20;
		deck.width = 35;
	
		
		Sphere bigBall = new Sphere();
		bigBall.radius = 15;
		
		Cylinder tank = new Cylinder();
		
		tank.radius = 10;
		tank.height = 30;
		
		
		
		System.out.println(Math.round(p.amount(deck)*100)/100.0  +" litter ");
		
		
		System.out.println(Math.round(p.amount(bigBall)*100)/100.0+" litter ");
		
		
		System.out.println(Math.round( p.amount(tank)*100) / 100.0 +" litter");
		

	}

}
