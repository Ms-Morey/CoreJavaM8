class Example
{
	void m1()
	{
		System.out.println("this : "+this);
	}
}

class DriverDemo
{
	public static void main(String[] args) 
	{
		Example obj = new Example();
		System.out.println("obj  : "+obj);
		obj.m1();

		System.out.println("________________");

		Example obj1 = new Example();
		System.out.println("obj1 : "+obj1);
		obj1.m1();
	}
}
