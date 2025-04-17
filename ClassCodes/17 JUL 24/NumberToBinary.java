//WAJP to find a binary number
import java.util.Scanner;
class NumberToBinary
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		short num = sc.nextShort();
		long rem =0;
		for(int i =1; i<=num; num/2)
		{
			if(num%2==1)
			{
				rem = (rem*10)+rem;
			}
			System.out.print(rem);
		}
	}
}