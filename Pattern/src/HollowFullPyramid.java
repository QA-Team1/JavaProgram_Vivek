/*		          * 
		        *   * 
		      *       * 
		    *           * 
		  *               * 
		* * * * * * * * * * * 
*/

import java.util.Scanner;

public class HollowFullPyramid {

	public static void main(String[] args) {
		
		String choice = "y";
		String ch1=null;
		
		do {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the number of rows for pyramid: ");
			int row = sc.nextInt();

			for (int i = 1; i <= row; i++) {
				for (int j = row - i; j >= 1; j--) {

					System.out.print("  ");

				}
				{
					for (int k = 1; k <= 2 * i - 1; k++) {

						if (i == row || k == 1 || k == 2 * i - 1) {

							System.out.print(" *");
						} else {
							System.out.print("  ");
						}

					}

				}
				System.out.println();
			}System.out.println("--------------------------------");
			
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println("Enter y if you wish to continue, otherwise press any key to exit: ");
			String ch = sc2.next();
			
			ch1=ch;
		} while (choice.equals(ch1));
		{
			System.out.println("-------------End----------------");
		}
	}
}