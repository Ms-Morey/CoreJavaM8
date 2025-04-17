class Pattern9
{
	public static void main(String[] args) 
	{
		char x='a';
		for(int i = 1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(x++ +" ");
			}
			System.out.println();
		}
	}
}
