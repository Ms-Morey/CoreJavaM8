class Pattern
{
	public static void main(String[] args) 
	{
		pattern1(5);
	}




		// 1
		// 2 6
		// 3 7 10
		// 4 8 11 13
		// 5 9 12 14 15
	private static void pattern1(int row)
	{
		for(int i =1; i<=row; i++)
		{
			int num =i;
			for(int j =1; j<=i; j++)
			{
				System.out.print(num+" ");
				num += (row-j);
			}
			System.out.println();
		}
	}



}
		
		

		