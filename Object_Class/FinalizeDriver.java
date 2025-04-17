class Student
{
	String name;
	// int rollNo;

	Student(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return name;
	}

}
class FinalizeDriver
{
	public static void main(String[] args) 
	{
		Student obj = new Student("Mahesh");
	}
}