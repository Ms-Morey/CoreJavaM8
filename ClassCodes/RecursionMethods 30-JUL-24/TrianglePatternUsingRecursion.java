/*
*
* *
* * *
* * * *
* * * * *
*/
class TrianglePatternUsingRecursion
{
	static int i =1; 
	static int j = 1;
	public static void main(String[] args) 
	{
		row();	
	}
	public static void row()
	{
		column();
		System.out.println();

		if(i++ ==5)
			return;
		row();
	}
	public static void column()
	{
		System.out.print("* ");
		if(j++ == i)
		{
			j=1;
			return;
		}
		column();
	}	
}