class LeapYear
{
	public static void main(String[] args) 
	{
		int year;
		System.out.print("The leap years between 2000 and 2050 are : ");
		for (year =2000;year<=2050;year++ ) 
		{
			if((year%4 == 0 && year%100!=0) || (year%100==0 && year%400==0))
			{
				System.out.println(year);
			}
		}	
	
	}
}