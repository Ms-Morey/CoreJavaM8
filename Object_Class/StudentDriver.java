class Student
{
	int id ; 
	String name ;
	String edu ;
	int yop ;
	Student(int id, String name, String edu, int yop)
	{
		this.id = id ;
		this.name = name ;
		this.edu = edu ;
		this.yop = yop ;
	}
	@Override
	public String toString()
	{
		return "Id : "+id+" , Name : "+name+" , Education : "+edu+" , YOP : "+yop;
	}
}
class StudentDriver
{
	public static void main(String[] args) 
	{
		Student obj1 = new Student(1,"Ramesh","BE",2024);
		Student obj2 = new Student(2,"Suresh","Bsc",2022);
		Student obj3 = new Student(3,"Mahesh","MCA",2025);
		Student obj4 = new Student(4,"Ganesh","Btech",2023);

		System.out.println(obj1);
		System.out.println(obj2);

	}
}