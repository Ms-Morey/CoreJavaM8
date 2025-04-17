//Even nubers in a particular range using methods.
class Return6
{
	public static void main(String[] args) 
	{
		printRangeOfEvent(100,200);
	}
	public static  void printRangeOfEvent(int start, int end)
	{
		while(start<=end)
		{
			if(checkEven(start))
				System.out.println(start);
			start++;
		}

	}
	public static boolean checkEven(int IntPredicate)
	{
		return ip%2==0;
	}

}