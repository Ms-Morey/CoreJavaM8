class Student
{
	int sid;
	String sname;
	String graduation;

	Student(int sid, String sname, String graduation)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.graduation = graduation;
	}

	void display()
	{
		System.out.println("Student details");
		System.out.println("Name : "+sname);
		System.out.println("Id : "+sid);
		System.out.println("graduation : "+graduation);
	}
}

class DriverStudent
{
	public static void main(String[] args) 
	{
		Student obj = new Student(1,"Ramesh","Computer");
		obj.display();


		Student obj1 = new Student(2,"Mahesh","IT");
		obj1.display();
	}
}