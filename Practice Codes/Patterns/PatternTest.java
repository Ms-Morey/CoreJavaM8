import java.util.Scanner;
class PatternTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a n : ");
		int n = sc.nextInt();
		// input is 4
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
