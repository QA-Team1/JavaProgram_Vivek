	
/*	 * * * * * * *
	 * * * * * *
	 * * * * *
	 * * * *
	 * * *
	 * *
	 *
*/
import java.util.Scanner;
public class InvertedHalfPyramid {

	public static void main(String[] args) 
	{
		String choice="y";
		String ch;
		
		
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of row for Pyramid: ");
			int row = sc.nextInt();
			
				for(int i=row; i>=1; i--)
				{
					for(int j=i;j>=1;j--)
					{
						System.out.print(" *");
					}
					System.out.println();
				}
				System.out.println("--------------------------------");
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Press 'y' if you wish to continue otherwise press any Key: ");
					String ch1 = sc2.next();
					ch = ch1;
			
		}while(ch.equals(choice));
		{
			System.out.println("-------------End----------------");
		}

	}

}
