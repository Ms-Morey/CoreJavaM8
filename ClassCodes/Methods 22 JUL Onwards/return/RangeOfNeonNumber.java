import java.util.Scanner;
class RangeOfNeonNumber 
{
	public static void main(String[] args) 
	{
		rangeOfNeon(1,100);
	}

	public static void rangeOfNeon(int start, int end)
	{
		while(start<=end)
		{
			if(isNeon(start))
				System.out.println(start);
			start++;
		}
	}

	public static boolean isNeon(int num)
	{
		if(num==sumOfDigits(num))
			return true;
		return false;
	}

	public static int squareOfNumber(int num)
	{
		int square = num*num;
		return square;
	}

	public static int sumOfDigits(int num)
	{
		int sqr = squareOfNumber(num);
		int rem = 0;
		int sum =0;
		while(sqr!=0)
		{
			rem=sqr%10;
			sum+=rem;
			sqr/=10;
		}
		return sum;
	}
}