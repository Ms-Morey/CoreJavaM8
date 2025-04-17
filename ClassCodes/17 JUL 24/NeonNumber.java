//WAJP to find out the neon number 
// Neon number is a number , sum of digits of it's square is equal to itself. 9 = 81, 8+1=9
// There are only 0,1,9 neon numbers in a trillion.
import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in)	;
		System.out.print("Enter the num : ");
		int num  = sc.nextInt();
		int sqr = num*num;
		int sum = 0;
	
		while(sqr!=0)
		{
			int rem = sqr%10;
			// System.out.print(rem);
			sum+=rem;
			sqr/=10;
		}
		if(sum==num)
		{
			System.out.println("It is a neon Nuber");
		}
		else
		{
			System.out.println("It is not a Neon Number");
		}
	}
}