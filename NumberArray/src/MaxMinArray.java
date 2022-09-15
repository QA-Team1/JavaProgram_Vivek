import java.util.Scanner;
public class MaxMinArray {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to sort: ");
		int num = sc.nextInt();
		
		int array[] = new int[num];
		System.out.println("Enter " +num +" elements: ");
		
		for(int i=0; i<array.length; i++ ) 
			{
			array[i]=sc.nextInt();
			}
		
		System.out.print("Your elements are: ");
			for (int a:array)
			{
				System.out.print(a +" ");
			}
			
		System.out.print("\nEven numbers from the elements you entered: ");
		int count=0;
		
			for(int i=0; i<array.length;i++) 
			{	
				
				if(array[i]%2==0) {
				System.out.print(array[i] +" ");
				count++;
				}
			
			}
			System.out.println("\nTotal even numbers are: " +count);
			
			int maxNum=0;
			
			for(int i=0; i<array.length;i++) 
			{
				if(maxNum<array[i]) 
				maxNum=array[i];
				
			}
			System.out.print("Largest element: " +maxNum);
			
			int temp=0;
			for(int i=0; i<array.length; i++) 
			{ 
				for(int j=i; j<array.length; j++) 
				{
					if(array[i]<array[j])
					{
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
						
					}
					
				}
				
			}
			
			System.out.print("\nElements sorted in descending order: ");
			for (int i=0; i<array.length; i++) 
			{
				System.out.print( +array[i] +" ");
			}
			System.out.println("\n3rd Largest element: " +array[2]);
			sc.close();
		
	}
	
	
		
}
	

