class Overloading
{
	public static void main(String[] args) 
	{
		addition(5,5);
		division(10,4);
		addition(5.0,5.0);
		division(10.0,4.0);
	}

	public static void addition(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void addition(double a, double b)
	{
		System.out.println(a+b);
	}

	public static void division(int a, int b)
	{
		System.out.println(a/b);
	}

	public static void division(double a, double b)
	{
		System.out.println(a/b);
	}
}