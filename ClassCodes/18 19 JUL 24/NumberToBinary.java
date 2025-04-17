//WAJP to find a binary number
import java.util.Scanner;
class NumberToBinary
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		short num = sc.nextShort();
		long rem =0;
		while(num>0)
		{
			rem = num%2;
			System.out.print(rem);
			num/=2;
		}
	}
}