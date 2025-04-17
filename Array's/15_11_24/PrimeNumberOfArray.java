class PrimeNumberOfArray
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
		primeArrayElement(arr);
	}

	public static void primeArrayElement(int [] arr)
	{
		for(int i:arr)
			if(isPrime(i))
				System.out.println(i);
	}

	public static boolean isPrime(int num)
	{
		if(num == 1 || num == 0)
			return false;
		for(int i =2; i<=num/2; i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}