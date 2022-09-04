/*	
     * * * * * *
	 *       *
	 *     *
	 *   *
	 * *
	 *   
*/

import java.util.Scanner;
public class HollowInvertedHalfPyramid {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of row for Pyramid:");
		int row = sc.nextInt();
		
		for(int i=row; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				if(i==j || i==row || j==1){
				
					System.out.print(" *");}
				else {
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
		}
		System.out.println("-------------End----------------");

	}

}
