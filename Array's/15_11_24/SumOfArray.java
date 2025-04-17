class SumOfArray
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,47,46,7,3,9,10};

		System.out.println(sumOfArray(arr));
	}

	public static int sumOfArray(int [] arr)
	{
		int sum = 0;
		for (int i : arr) 
		{
			sum+=i;
		}
		return sum;
	}
}