class Print_10_num
{
	static int num = 1;
	public static void main(String[] args) 
	{
		printNumber();	
	}
	public static void printNumber()
	{
		System.out.println(num++);
		if(num>10)
			return;
		printNumber();
	}
}