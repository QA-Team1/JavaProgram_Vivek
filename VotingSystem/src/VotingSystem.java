import java.util.Scanner;

public class VotingSystem 
{

	public static void main(String[] args) throws InvalidAgeException 
	{
		String n = "null";
		String g = "null";
		int a = 0;

		Scanner sc = new Scanner(System.in);

		Person[] p1 = new Person[3];

		for (int i = 0; i < 3; i++) 
		{
			System.out.println("Enter name, gender and age of the person. ");
			p1[i] = new Person(n, g, a);
			String name = sc.next();
			String gender = sc.next();
			int age = sc.nextInt();

			p1[i].setName(name);
			p1[i].setGender(gender);
			p1[i].setAge(age);

			try 
			{
				if (age < 18) 
				{
					throw new InvalidAgeException(name + " should be above 18 years of age. ");
				}
			} 
			
			catch (InvalidAgeException age1) 
			{
				System.out.println(age1);
			}
		}

		System.out.println();
		System.out.println("Eligible Voter: ");
		
		for (int i = 0; i < 3; i++) 
		{
			if (p1[i].getAge() >= 18 && p1[i].getGender().contentEquals("male") || p1[i].getGender().contentEquals("Male"))
				System.out.println(p1[i]);
		}

		sc.close();

	}

}
