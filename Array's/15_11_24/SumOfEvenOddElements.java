class SumOfEvenOddElements
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};

		System.out.println("Sum of Even Elements in array is : "+sumOfEvenElements(arr));
		System.out.println("Sum of Odd Elements in array is : "+sumOfOddElements(arr));
	}

	public static int sumOfEvenElements(int [] arr)
	{
		int sumOfEven = 0;
		for (int i :arr ) 
		{
			if(i%2==0)
				sumOfEven+=i;
		}
		return sumOfEven;
	}

	public static int sumOfOddElements(int [] arr)
	{
		int sumOfOdd = 0;
		for (int i :arr ) 
		{
			if(i%2!=0)
				sumOfOdd+=i;
		}
		return sumOfOdd;
	}
}