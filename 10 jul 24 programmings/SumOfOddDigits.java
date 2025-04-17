import java.util.Scanner;
class SumOfOddDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num =sc.nextInt();
		int sum=0;

		while(num!=0)
		{
			int last =num%10;
			if(last%2!=0)
			{
				sum+=last;
			}
			num/=10;
		}
		System.out.println("The sum of Odd digits in a num is : "+sum);
	}
}