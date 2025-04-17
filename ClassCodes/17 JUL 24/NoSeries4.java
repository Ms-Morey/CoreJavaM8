//781 783 793 791 805 799 817 807 829 815 841 823m
class NoSeries4
{
	public static void main(String[] args) 
	{
		int num = 781;
		int num1 = 783;
		System.out.print(num+" ");
		System.out.print(num1+" ");
		for (int i = 1;i<=10 ;i++ ) 
		{

			if (i%2!=0 ) 
			{
				num+=12;

				System.out.print(num+" ");
			}else{
				num1+=8;
				System.out.print(num1+" ");
			}
			
		}

	}
}