class Pattern8
{
	public static void main(String[] args) 
	{
		int x=1;
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