
// WAJP to print ButterflyPattern
/*

*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

*/
import java.util.Scanner;
class TestPattern2
{
	public static void main(String[] args) 
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of n : ");

		int n = sc.nextInt();
		System.out.println();

	 	// first triangle
	 	for(int i=1; i<=n; i++)
	 	{
	 		for(int j=1; j<=i; j++)
	 		{
	 			System.out.print("* ");
	 		}
	 		for(int j=1; j<=2*(n-i); j++)
	 		{
	 			System.out.print("  ");
	 		}
	 		for(int j=1; j<=i; j++)
	 		{
	 			System.out.print("* ");
	 		}
	 		System.out.println();
	 	}
	 	
	 	//below half
	 	for(int i =n; i>=1; i--)
	 	{
	 		for(int j=1; j<=i; j++)
	 		{
	 			System.out.print("* ");
	 		}
	 		for(int j=1; j<=2*(n-i); j++)
	 		{
	 			System.out.print("  ");
	 		}
	 		for (int j=1;j<=i;j++) 
	 		{
	 			System.out.print("* ");	
	 		}
	 		System.out.println();
	 	}
		
	}
}