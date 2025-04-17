class Examples_Day2
{
	public static void main(String[] args) 
	{
		System.out.println(isLeapYear(2000));
	}

	public static boolean isLeapYear(int year)
	{
		if(year%100 == 0 && year%400 == 0 || year%100!=0 && year%4==0)
			return true ;
		else
			return false;
	}
}