//WAJP to find out a strong number
import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(isStrong(num));
	}

	public static String isStrong(int num)
	{
		int sum = 0;
		int rem = 0;
		for(int i = num; i>0; i/=10)
		{
			rem = i%10;
			sum += factorial(rem);
		}
		if(num==sum)
			return "is Strong Number";
		return "is Not Strong Number";
	}
	public static int factorial(int num)
	{
		int fact = 1;
		for(int i = num; i>0; i--)
		{
			fact*=i;
		}
		return fact;
	}
}