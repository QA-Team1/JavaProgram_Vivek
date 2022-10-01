package problem9;

import java.util.Scanner;

 public class taxCalculator  
{
	public static int taxCalculator() 
	{
		double totalTax = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your gross salary: ");
		int grossSalary = sc.nextInt();
		
		System.out.println("Enetr your amount of saving: ");
		int saving = sc.nextInt();
		
		if(saving>100000)
		{
			System.out.println("Savnig can not more than 100000. Saving has been reduced to 100,000.");
			saving = 100000;
		}
		
		
		
		int taxableIncome = grossSalary - saving;
		System.out.println("Your taxable income is: " +taxableIncome);
		
		if(taxableIncome<=100000) 
		{
			double taxSlab0= taxableIncome*0;
			
			totalTax=totalTax+taxSlab0;
		}
		
		if(taxableIncome>100000 && taxableIncome<=200000) 
		{
			double taxSlab1 = (taxableIncome-100000)*0.1;
			totalTax = totalTax+taxSlab1;
		}
		
		if(taxableIncome>200000 && taxableIncome<=500000) 
		{
			double taxSlab2 = (taxableIncome-200000)*0.2;
			totalTax= totalTax+taxSlab2+10000;
		}
		
		if(taxableIncome>500000)
		{
			double taxSlab3 = (taxableIncome - 500000)*0.3;
			totalTax= totalTax+taxSlab3+70000;
		}
		
		System.out.println("Total Tax: " +totalTax);
		
		
		return taxableIncome;

		
	}
}
