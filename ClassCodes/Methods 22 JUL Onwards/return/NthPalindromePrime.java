// WAJP to find out nth Palindrome Prime
import java.util.Scanner;
class NthPalindromePrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nth Position : ");
		int pos = sc.nextInt();
		System.out.println(nthPalPrime(pos));
	}

	public static int nthPalPrime(int pos)
	{
		int count = 0;
		for(int i = 2; ; i++)
		{
			if(isPalPrime(i))
			{
				count++;
				if(count == pos)
					return i ;
			}

		}
	}

	public static boolean isPalPrime(int num)
	{
		if(isPalindrome(num) && isPrime(num))
			return true;
		return false;
	}

	public static boolean isPalindrome(int num)
	{
		int rev =0;
		for(int i=num; i!=0;i/=10)
			rev = (rev*10)+(i%10);
		if(num==rev)
			return true;
		return false;
	}

	public static boolean isPrime(int num)
	{
		for(int i=2; i<=num/2; i++)
			if(num%i==0)
				return false;
			return true;
	}
}