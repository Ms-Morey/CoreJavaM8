class Recursions
{
	static int num = 1;
	public static void main(String[] args) 
	{
		print_1_to_10();
	}
	public boolean isPrime(int num)
	{
		return false;
	}

	public static void print_1_to_10()
	{
		System.out.println(num++);
		if(num>10)
			return;
		print_1_to_10();
	}
	
}