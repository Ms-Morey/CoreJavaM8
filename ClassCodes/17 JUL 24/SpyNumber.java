//WAJP to find out spy number or not 
// Spy num is a num where sum of it's digits and product of it's digits is equal.
import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in)	;
		System.out.print("Enter the num : ");
		int num  = sc.nextInt();
		int sum = 0;
		int prod=1;
			while(num!=0)
			{
				int rem = num%10;
				sum+=rem;
				prod*=rem;
				num/=10;
			}
			if(sum==prod)
			{
				System.out.println("It is a Spy Number");
			}
			else
			{
				System.out.println("It is not a Spy Number");
			}
	
	}
}