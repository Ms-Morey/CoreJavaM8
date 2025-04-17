class Print_a_to_z
{
	static char ch ='a';
	public static void main(String[] args)
	{
		printAlphabate();
	}
	public static void printAlphabate()
	{
		System.out.println(ch++);
		if(ch>'z')
			return;
		printAlphabate();
	}
	
}