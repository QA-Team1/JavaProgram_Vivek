package problem8;

/*Define a method to calculate power of a number raised to other 
 * i.e. ab using recursion where the numbers 'a' and 'b' are to be entered by the user*/


import java.util.Scanner;
public class PowerOfNum 
{
	public static int power(int a, int b) 
	{
		if(b==1) 
		{
			return a;
		}
		else
		{
			return (a*power(a,b-1));
		}
	}

public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value for base and power: ");
	int a= sc.nextInt();
	int b= sc.nextInt();
	System.out.println(power(a,b));
}
}
