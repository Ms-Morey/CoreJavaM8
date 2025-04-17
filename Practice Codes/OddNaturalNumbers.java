// WAJP to  find out first n odd natural numbers
import java.util.Scanner;
class OddNaturalNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("The first n natural numbers are : ");

		int sum = 0;
		for(int i =1; i<=n; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("The sum of first n natural odd numbers is : "+ sum);
	}
}