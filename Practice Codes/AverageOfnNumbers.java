//WAJP to find out average of n natural numbers.
import java.util.Scanner;
class AverageOfnNumbers
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n =sc.nextInt();
		float sum=0;
	System.out.print("First "+n+" natural numbers are : ");
	
		for(int i=1; i<=n; i++)
		{
			sum += i ;
			System.out.println(i);
		}
		System.out.println();
		float avg =sum/n;
		System.out.println("The sum of "+n+" natural number is "+sum);
		System.out.println();
		System.out.println("The average of first "+n+" natural numbers is "+avg);
		
	}
}	