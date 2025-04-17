class TrianglePattern
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<=4;i++ ) 
		{
			//loop to print space
			for (int j=3;j>=i;j-- ) 
				System.out.print("  ");
			
			//loop to print stars
			for(int j=1; j<=i; j++)
				System.out.print("* ");

			System.out.println();
		}
	}
}