class Exp3Pattern3
{
	public static void main(String[] args) 
	{
		int x=0;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				x+=i;
				System.out.print(x+" ");
			}
			
			System.out.println();

		}
	}
}