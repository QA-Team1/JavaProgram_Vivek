package problem7;

/*
 * 
 * Define a method named 'perfect' that determines if parameter number is a 
 * perfect number. Use this function in a program that determines and prints 
 * all the perfect numbers between 1 and 1000.
[An integer number is said to be "perfect number" if its factors, 
including 1(but not the number itself), sum to the number. E.g., 
6 is a perfect number because 6=1+2+3].

*/

import java.util.Scanner;
public class PerfectNumber {
	
	void perfect()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range of the number:  ");
		long n1 = sc.nextInt();
		long n2 = sc.nextInt();
		
		  for(long i=n1; i<=n2; i++ )
		  {
			  long sum=0;
			  
			  for (long j=1; j<i; j++)
			  {
				  if(i%j==0)
				  {
					  sum=sum+j;
				  }
			  }
			  if (sum==i)
			  {
				  System.out.print(i +"  ");
			  }
		  }
		 
		
		
		
	}

	public static void main(String[] args) {
	
		PerfectNumber pf = new PerfectNumber();
		pf.perfect();
	}

}
