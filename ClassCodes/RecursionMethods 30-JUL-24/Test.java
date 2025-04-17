import java.util.Scanner;
class Test
{	static int i =2;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		if(isPrime(num))
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not prime");
	}
	public static boolean isPrime(int num)
	{
		if(num%i++ == 0)
			return false;
		return true;
		isPrime();
	}
}