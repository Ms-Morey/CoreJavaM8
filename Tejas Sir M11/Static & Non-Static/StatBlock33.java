class StatBlock33
{
	static int i = (int)xyz(234,'8');

	static
	{
		int i = 100;
		i = i+ (int)xyz(50,'z');
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
		System.out.println(i);
		i = 1000;
		int i = (int)xyz(90,'m');
		StatBlock33.i = (int)i + StatBlock33.i;
	}

	public static double xyz(double x, double y)
	{
		System.out.println("Frome xyz");
		return x+y;
	}
}