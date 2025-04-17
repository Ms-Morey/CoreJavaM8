// WAJP to find out if a number is a tech number or not
/* when an even digit number is divided into exactly two parts and 
the square value of the sum of those two numbers is equal to the original number */
import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int dup = num;
		int div = 1;
		int count = 0;

		while(num>0)
		{
			count++;
			num/=10;
		}
		if(count%2==0)
		{
			// for(int j=1; j<=(count/2); j++)
				// div *= 10;

				int fh = dup/100;
				int lh = dup%100;
				int add = fh + lh;
				int sqr = add*add;
				System.out.println((sqr==dup)? "Tech Number":"Not a Tech Number");
			
		}
		else
		{
			System.out.println("Not a tech Number ");
		}
	}
}