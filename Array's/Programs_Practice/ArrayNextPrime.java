class ArrayNextPrime
{
	public static void main(String[] args) 
	{
		int [] arr = {4,6,8,9,10,12,14,15,16};
		nextPrimeOfArray(arr);
		
	}

	public static void nextPrimeOfArray(int [] arr)
	{
		for(int i:arr)
		{
			System.out.println(nextPrime(i));
		}
	}
	public static int nextPrime(int num)
	{
		if(isPrime(num))
			return num;
		else
		{
			for(int i=num; ;i++)
			{
				if(isPrime(i))
					return i;
			}
		}
	}

	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		for(int i = 2; i<=num/2; i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}