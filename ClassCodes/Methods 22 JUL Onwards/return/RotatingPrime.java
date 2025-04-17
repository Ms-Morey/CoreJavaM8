//WAJP to find out rotating prime number
class RotatingPrime
{

	public static void main(String[] args) 
	{
		rangeOfRotPrime(1,1000);
	}

	public static void rangeOfRotPrime(int start,int end)
	{
		while(start<=end)
		{
			if(isRotatingPrime(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}

	public static boolean isRotatingPrime(int num)
	{
		if(isPrime(num))
		{
			int rot = rotate(num);
			while(num!=rot)
			{
				if(isPrime(rot))
				{
					rot=rotate(rot);
				}
				else
					break;
			}
			return num==rot;
		}
		else
			return false;
	}

	public static int rotate(int num)
	{
		// int rem = num%10;
		// int rot = (rem*power(10,count(num)-1))+(num/10);
		// return rot;
		return(num%10)*power(10,count(num)-1)+(num/10);
	}

	public static int power(int base , int raise)
	{
		int pow = 1;
		for(int i = 1; i<=raise; i++)
		{
			pow*=base;
		}
		return pow;
	}

	public static int count(int num)
	{
		int count=0;
		for(int i=num; i!=0; i/=10)
			count++;
		return count;
	}
	public static boolean isPrime(int num)
	{
		if(num<2)
		return false;
		for(int i = 2; i<=num/2; i++)
			if(num%i==0)
				return false;
		return true;
	}
}