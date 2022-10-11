
public class Person 
{

	private String name;
	private String gender;
	private int age;

	public Person(String name, String gender, int age) 
	{
		this.name = name;
		this.gender = gender;
		this.age = age;

	}

	@Override
	public String toString() 
	{
		return "Voter Name is " + name + ". Gender is " + gender + " and " + name + " is " + age + " years old.";
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

}
