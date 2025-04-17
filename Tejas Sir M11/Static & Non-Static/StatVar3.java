class StatVar3
{
	static int i;
	static int j = 1000;
	public static void main(String[] args) 
	{
		System.out.println(i);
		i = 100;
		System.out.println(i);
	}
}