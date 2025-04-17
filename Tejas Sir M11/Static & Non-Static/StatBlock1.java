class StatBlock1
{
	static
	{
		System.out.println("From stat block 1");
	}
	static
	{
		System.out.println("From stat block 2");
	}
	static
	{
		System.out.println("from stat block 3");
	}

	public static void main(String[] args) 
	{
		System.out.println("From main");
	}

	static
	{
		System.out.println("static Block 4");
	}
}