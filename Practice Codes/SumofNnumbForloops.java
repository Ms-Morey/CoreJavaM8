//WAJP to find sum of 10 narural numbers
import java.util.Scanner;
class SumofNnumbForloops
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int sum =0;
		System.out.println("The first "+n+" natural numbers are : ");
		for (int i=1;i<=n;i++ )
		{	System.out.println(i);
			sum += i;
		}
		System.out.println("The sum of first "+ n +" natural numbers is "+sum);
	}
}