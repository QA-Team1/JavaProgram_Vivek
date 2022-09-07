
/*
			*
		   * *
		  * * *
		 * * * *
		  * * *
		   * *
		    *
		    
*/

import java.util.Scanner;
public class DiamondNumbers {

	public static void main(String[] args) {

		String choice="y";
		String ch1=null;
		
		
		do 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of row for Diamond(only add odd numbers): ");
			int row1 = sc.nextInt();
			
			int row = (row1+1)/2;
			for (int i = 1; i <= row; i++) {
				for (int k = row - i; k >= 1; k--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(" " +i);
				}
				System.out.println();
			}
			for (int i = row-1; i>= 1; i--) 
			{
				for (int j = row-i; j>=1; j--) 
				{ System.out.print(" "); }
												  
				 for(int k=1; k<=i; k++)
				{
					System.out.print(" " +i);
				}
				System.out.println();
	
			}System.out.println("--------------------------------");
			
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println("Enter y if you wish to continue, otherwise press any key to exit: ");
			String ch = sc2.next();
			
			ch1=ch;
			
		}while(choice.equals(ch1)); {
			System.out.println("-------------End----------------");
		}

	}
}
