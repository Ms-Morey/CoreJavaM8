class Pattern3
{
	public static void main(String[] args) 
	{
		int x=0;
		int y=1;
		for(int i=1; i<=4; i++)
		{
			for (int j=1;j<=4;j++) 
			{
				if(i%2!=0)
				{
					x+=2;
					System.out.print(x+" ");
				}
				else
				{
					System.out.print(y+" ");
					y+=2;
				}
			}
			System.out.println();
		}
		
	}
}