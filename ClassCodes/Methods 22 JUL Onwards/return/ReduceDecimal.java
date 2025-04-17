//WAJP to reduce the decimal places in a number
import java.util.Scanner;
class ReduceDecimal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a doubl number : ");
		double num = sc.nextDouble();
		System.out.print("Enter a decimal places needed : ");
		int pos = sc.nextInt();
		
		System.out.println(reduceDecimalPointValue(num,pos));
	}

	public static double reduceDecimalPointValue(double num, int pos)
	{
		num = num*power(10,pos);
		num = (int)num;// removes the values after poin by converting double into int
		num = num/power(10,pos); // the decimal value needed by diving the number.
		return num;
	}

	public static int power(int base , int raise)
	{
		int pow = 1;
		for(int i = 1; i<=raise; i++)
		{
			pow*=base;
		}
		return pow;
	}
}