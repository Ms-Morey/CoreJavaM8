//5 26 17 124 37 342 65 728 101 1330
class NoSeries2
{
	public static void main(String[] args) 
	{
		for (int i=2;i<=11 ; i++) 
		{
			if (i%2==0) 
			{
				System.out.print(((i*i) + 1) + " ");
			}else{
				System.out.print(((i*i*i) - 1 ) + " ");
			}
			
		}
	}
}