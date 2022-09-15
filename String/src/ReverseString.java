import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sentences you want to reverse: ");
		String s1 = sc.nextLine();
		
		char ch;
		
		for (int i=0; i<1; i++)
		{
			 ch = s1.charAt(i); 
			
			  { 
				  for(int j= s1.length()-1; j>=0; j--) 
				  { 
					  ch= s1.charAt(j);
					  System.out.print(ch);
			  	  } 
			  }
		}
		sc.close();
			
	}

}
