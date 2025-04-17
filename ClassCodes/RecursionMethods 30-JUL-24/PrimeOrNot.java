// WAJP to check the number is prime or not using recursions
import java.util.Scanner;
class PrimeOrNot
{
	static int num = 17;
	static int i =num/2;
	static int count=0;

	public static void main(String[] args) 
	{
		isPrime();
	}
	public static void isPrime()
	{
		if(count==0)
			System.out.println("num is prime");
		else
			System.out.println("num is not prime");
	}
	public static void factors()
	{
		if(i==1)
			return;
		if(num%i==0)
		{
			count++;
			// System.out.println(i);
		}
		i--;
		factors();
	}
}
 
	


