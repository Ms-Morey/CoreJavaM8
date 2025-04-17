public class SumOfDigits
{
	static int num=12345;
	static int rem=0;
	static int sum=0;
	public static void main(String[] args)
	{
		sumNum();
		System.out.println(sum);
	}
	public static void sumNum()
	{
		if(num==0)
			return;
		rem = num%10;
		sum+=rem;
		num/=10;
		sumNum();
	}
}