package fibonacciNthTerm;
import java.util.Scanner;


public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter n term: ");
		int x = sc.nextInt();	
		
		FibonacciSeries f = new FibonacciSeries();
		System.out.println(f.fib(x));
		sc.close();
	}
	
	
	public int fib(int x)
	{
		if(x==0)
		{
			return 0;
		}
		else if(x==1)
		{
			return 1;
		}
		
		else
		{
			return fib(x-1)+fib(x-2);
		}
	}
	
	
}
