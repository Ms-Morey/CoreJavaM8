class DemoExample
{
	String a = "Global Var";

	DemoExample()
	{
		this.a = "GLOBAL VAR";
	}
	{
		System.out.println(this.a);
	}

	void m1()
	{
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("hello");
		DemoExample obj = new DemoExample();
		obj.m1();
		System.out.println(obj.a);
	}
}