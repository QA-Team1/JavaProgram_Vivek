package problem3;

public class Member {

	String name="null";
	int age;
	String ph;
	String address;
	int salary;
	
	public void printSalary()
	{
		System.out.println("Salary of " +name +" : " +"$"+salary);
	}

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.name = "Vivek";
		e.age = 29;
		e.ph = "416-474-7565";
		e.address = "1200 York Mills Road";
		e.salary = 50000;
		e.specialization = "QA";
				
		e.printSalary();
		
		Manager m = new Manager();
			m.name = "xyz";
			m.age = 45;
			m.ph = "437-588-4490";
			m.address = "Canada";
			m.salary = 100000;
			m.department = "IT";
			
			m.printSalary();
		
		
	}
}
