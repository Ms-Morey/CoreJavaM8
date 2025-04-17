//WAJP to print the series 10, 12, 68, 30, 222, 56
class NoSeries1
{
	public static void main(String[] args) 
	{
		for (int i=2;i<=11 ; i++) 
		{
			if (i%2==0) 
			{
				System.out.print(((i*i*i) + i) + " ");
			}else{
				System.out.print(((i*i) + i) + " ");
			}
			
		}
		
	}
}