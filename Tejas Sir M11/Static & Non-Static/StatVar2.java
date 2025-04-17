class StatVar2
{
	static double var2;

	public static void main(String[] args) 
	{
		System.out.println(var2); //0.0
		var2 = 10.0;
		demo(); //10.0 
		System.out.println(var2);//100.0
	}

	public static void demo()
	{
		System.out.println(var2);
		var2 = 100.0;
	}
}