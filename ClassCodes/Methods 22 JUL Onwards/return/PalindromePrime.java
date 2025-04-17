//WAJP to find the number is palidrome prime or not;
import java.util.Scanner;
class PalindromePrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(isPalindromePrime(num));
	}
	public static  String isPalindromePrime(int num)
	{
		if(isPalindrome(num)&&isPrime(num))
			return "Num is PalindromePrime";
		return "Num is not PalindromePrime";
	}
	public static boolean isPrime(int num)
	{
		for(int i =2; i<=num/2; i++)
			if(num%i==0)
				return false;
			return true;
	}
	public static boolean isPalindrome(int num)
	{	int rev =0;
		for(int i=num;i!=0; i/=10)
		{
			rev =(rev*10)+(i%10);
		}
		if(num==rev)
			return true;
		return false;
	}
}