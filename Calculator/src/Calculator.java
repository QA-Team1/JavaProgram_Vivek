import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double result;
		String ch = null;
		String choice = "y";
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter number 1: ");
			double n1 = sc.nextDouble();

			System.out.println("Enter number 2: ");
			double n2 = sc.nextDouble();

			System.out.println("Press + for additioin.");
			System.out.println("Press - for subtraction.");
			System.out.println("Press * for multiplication.");
			System.out.println("Press / for division.");

			char operation = sc.next().charAt(0);

			switch (operation) {

			case '+':
				result = n1 + n2;
				System.out.println(result);
				break;

			case '-':
				result = n1 - n2;
				System.out.println(result);
				break;

			case '*':
				result = n1 * n2;
				System.out.println(result);
				break;

			case '/':
				result = n1 / n2;
				System.out.println(result);
				break;

			default:
				System.out.println("Please enter valid input:");

			}
			Scanner sc2 = new Scanner(System.in);

			System.out.println("Press y if you wish to continue otherwise press any key: ");
			String ch1 = sc2.next();
			ch = ch1;

		} while (choice.equals(ch));
		{
			System.out.println("-------------END------------");
		}

	}
}
