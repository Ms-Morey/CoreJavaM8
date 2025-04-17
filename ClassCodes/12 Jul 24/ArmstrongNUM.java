//ArmStrongNumber
// it is a number which is a sum of power of all the digits is equal to that digit. 
// where power is equal to the length of that digit.
import java.util.Scanner;
class ArmstrongNUM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num = sc.nextInt();
		int dup = num;
		int dup1= num;
		int sum =0;
		int length =0;
		int rem =0;
		int pow =1;

		while(num>0)
		{
			length++;
			num/=10;
		}
		while(dup>0)
		{
			rem = dup%10; // last digit of a number
			pow =1;
			// System.out.println(rem);
			for(int i = 1; i<=length; i++)
			{
				// System.out.println(i);
				pow=pow*rem;	
			}
			sum =sum+pow;
			dup/=10;
		}
		String op=(sum==dup1)?dup1+" is a Armstrong number":dup1+" is not a Armstrong number.";
		System.out.println(op);	
	}
}