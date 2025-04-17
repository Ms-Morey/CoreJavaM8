//print the following pattern using recursion
/*
1
1 2
1 2 3
1 2 3 4
*/
class NumPattern
{
	static int i = 1;
	static int j = 1;
	public static void main(String[] args) 
	{
		row();
	}
	public static void row()
	{
		if(i>4)
			return;
		column();
		i++;
		System.out.println();
		j=1;
		row();

	}
	public static void column()
	{
		if(j>i)
			return;
		System.out.print(j+" ");
		j++;
		column();
	}
}