import java.util.Scanner;
class Diamond
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a n : ");
		int n =sc.nextInt();
		for(int i=1; i<=n-1; i++)
		{
			for(int j=n-1; j>=i; j--)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--)
		{
			for(int j=n-1; j>=i; j--)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}