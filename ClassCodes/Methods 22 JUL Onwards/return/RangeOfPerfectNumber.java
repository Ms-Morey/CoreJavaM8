import java.util.Scanner;
class RangeOfPerfectNumber
{
	public static void main(String[] args) 
	{
		rangeOfPerfectNum(1,10000);
	}

	public static void rangeOfPerfectNum(int start, int end)
	{
		while(start<=end)
		{
			if(isPerfectNum(start))
				System.out.println(start);
			start++;
		}

	}

	public static boolean isPerfectNum(int num)
	{
		if(num==sumOfDivisors(num))
			return true;
		return false;
	}

	public static int sumOfDivisors(int num)
	{
		int sum = 0;
		for(int i = 1; i<=num/2; i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
}