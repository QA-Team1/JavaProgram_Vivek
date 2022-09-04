
/*	 *
	 * *
	 * * *
	 * * * *
	 * * * * *
	 * * * * * *
*/

import java.util.Scanner;

public class HalfPyramid {

	public static void main(String[] args) {
		
		String choice="y";
		String ch;
	
		do 
		{
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the number of row for Pyramid.");
			int row = sc2.nextInt();
			
			
			
				for (int i = 1; i <= row; i++) 
				{
					for (int j = 1; j <= i; j++) 
					{
						System.out.print(" *");
					}
					System.out.println();
		
				}
				
				System.out.println("--------------------------------");
				
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter 'y' if you wish to continue otherwise press any Key: ");
				String ch1 = sc1.next();
							
				ch = ch1;
				
		}while(ch.equals(choice)); {
			System.out.println("-------------End----------------");
		}


	}
}
