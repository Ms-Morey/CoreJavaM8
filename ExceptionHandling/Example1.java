// class Example1
// {
	//Non-static variables examples 
// 	String str = "non-static variable";
// 	{
// 		System.out.println(str);
// 	}
// 	public static void main(String[] args) 
// 	{

// 	}
// 	public void m1()
// 	{
// 		System.out.println(str);
// 	}
// }

// class Example1
// {
// 	String str = "non-static variable";

// 	static Example1 obj = new Example1();

// 	static
// 	{
// 		System.out.println("static block");
// 		System.out.println(obj.str);
// 	}
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("main");
// 		System.out.println(obj.str);
// 		m1();
// 	}
// 	public static void m1()
// 	{
// 		Example1 obj = new Example1();
// 		System.out.println(obj.str);
// 	}
// }

// class Example1
// {
// 	String str = "non-static variable";
// 	static Example1 obj = new Example1();

// 	public static void main(String[] args) 
// 	{
// 		Example18 obj = new Example18();
// 		obj.m1();
// 		obj.m2();
// 	}
// }
// class Example18
// {
// 	void m1()
// 	{
// 		System.out.println("m1() Example18");
// 		System.out.println(Example1.obj.str);
// 	}
// 	void m2()
// 	{
// 		System.out.println("m1() Example18");
// 		System.out.println(Example1.obj.str);
// 	}
// }


class Example1
{
	public static void main(String[] args) 
	{
		System.out.println("main()");
		Example1 obj = new Example1();

		obj.m1();
	}

	void m1()
	{
		System.out.println("hello from m1()");
		m2();
	}
	void m2()
	{
		System.out.println("hello from m2()");
	}
}