class Pattern11
{
	public static void main(String[] args) 
	{
		int x=1;
		for(int i = 1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(x +" ");
				x+=2;
			}
			System.out.println();
		}
	}
}