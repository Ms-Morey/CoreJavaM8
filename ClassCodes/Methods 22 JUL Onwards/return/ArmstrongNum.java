//WAJP to find out Armstrong Number
import java.util.Scanner;
class ArmstrongNum
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		isArmStrong(num);
	}

	public static void isArmStrong(int num)
	{
		if(num==sumOfPowerOfDigits(num))
			System.out.println(num+" is a Armstrong number");
		else
			System.out.println(" is not a Armstrong number");
	}

	public static int sumOfPowerOfDigits(int num)
	{
		int count = countOfDigits(num);
		int sum = 0;
		int rem=0;
		while(num>0)
		{
			rem = num%10;
			sum+=power(rem,count);
			num/=10;
		}
		return sum;
	}

	public static int power(int rem, int count)
	{
		int pow=1;
		for(int i = 1; i<=count; i++)
		{
			pow*=rem;
		}
		return pow;
	}

	public static int countOfDigits(int num)
	{	
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}
}