//WAJP to find the Palindrome prime in a particular range
import java.util.Scanner;
class RangeOfPalindromePrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a starting point : ");
		int start = sc.nextInt();
		System.out.print("Enter end point of range : ");
		int end = sc.nextInt();
		rangeOfPalPrime(start,end);
	}

	public static void rangeOfPalPrime(int start , int end)
	{
		while(start<=end)
		{
			if(isPalindromePrime(start))
				System.out.println(start+" ");
			start++;
		}
	}

	public static boolean isPalindromePrime(int num)
	{
		if(isPalindrome(num) && isPrime(num))
			return true;
		return false;
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

	public static boolean isPalindrome(int num)
	{
		int i = num;
		int rev = 0;
		while(i>0)
		{
			rev = (rev*10)+(i%10);
			i/=10;
		}
		if(rev == num)
			return true;
		return false;
	}

}