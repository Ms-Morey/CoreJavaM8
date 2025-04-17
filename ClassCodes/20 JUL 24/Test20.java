class Test20
{
	public static void main(String[] args) 
	{
		int count=0;
		int i = 11;
		// for(int i = 1; i<=1000; i++)
		// {
			for(int j = 2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
				System.out.println("is prime");
			}
		// }
	}
}