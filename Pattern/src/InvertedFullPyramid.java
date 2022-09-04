
/*		* * * * * * * * * * * 
		  * * * * * * * * * 
		    * * * * * * * 
		      * * * * * 
		        * * * 
		          * 
*/

import java.util.Scanner;
public class InvertedFullPyramid {

	public static void main(String[] args) {
		
		String choice="y";
		String ch;
		
		
		do 
		{
			
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of row for pyramid: ");
			int row = sc.nextInt();
			
			for(int i=row; i>=1; i--)
			{
				for(int j=row-i; j>=1; j--) {
				System.out.print("  ");
				}
				for(int k=1; k<=(2*i-1); k++)  {
					System.out.print("* ");
				}
				System.out.println();	
			}
			System.out.println("--------------------------------");
			
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println("Enter y if you wish to continiue otherwise press any key to exit: ");
			String ch1= sc2.next();
			
			ch=ch1;
			
			}while(choice.equals(ch));{
				System.out.println("-------------End----------------");
			}
	}

}
