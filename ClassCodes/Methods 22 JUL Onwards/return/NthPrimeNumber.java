import java.util.Scanner;
class NthPrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		nthPrime(num);
	}

	public static void nthPrime(int num)
	{	
		int count=0;
		for (int i = 2; ; i++) 
		{
			if(isPrime(i))
			{
				count++;
				if(count == num)
				{
					System.out.println(i);
					return;
				}
			}
		}
	}

	public static boolean isPrime(int num)
	{
		for(int i = 2; i<=num/2; i++)
			if(num%i==0)
				return false;
		return true;
	}
}