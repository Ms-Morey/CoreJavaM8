class AverageOfArray
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(averageOfArray(arr));
	}

	public static int averageOfArray(int [] arr)
	{
		int sum =0;
		int len = arr.length;
		for (int i : arr ) 
		{
			sum+=i;	
		}
		int avg = sum/len;
		return avg;
	}
}