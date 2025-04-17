class NoSeries
{
	public static void main(String[] args) 
	{
		int num = 6;

		for (int i = 1;i<= 10 ;i++ ) 
		{
			System.out.print(num + " ");
			if (i%2!=0)
			{
				num*=4;
				
			}else{
				num/=2;
			}
			
		}
		
	}
}