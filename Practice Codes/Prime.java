import java.util.Scanner;
class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		System.out.println(reverse(num));
	}


	public static boolean isPrime(int num)
	{
		for(int i = 2; i<=num/2; i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

	public static int factorial(int num)
	{
		int fact = 1;
		for(int i = num; i>=1; i--)
		{
			fact*=i;
		}
		return fact;
	}

	public static int reverse(int num)
	{
		int rem = 0;
		int rev = 0;
		while(num!=0)
		{
			rem = num%10;
			rev = (rev*10)+rem;
			num/=10;
		}
		return rev ;
	}
}