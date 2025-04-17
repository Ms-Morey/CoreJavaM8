class NoMain
{
	static
	{
		System.out.println("Hello World from static");
		helloWorld();
		System.exit(0);
	} 
	public static void helloWorld()
	{
		System.out.println("Hello from a Hello World Method");
	}
}