// max between 3 nums
import java.util.Scanner;
class MaxNo2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();

		System.out.print("Enter num3 : ");
		int num3 = sc.nextInt();
	
		int max = (num1>num2)?((num1>num3)?(num1):(num3)) :((num2>num3)?(num2):(num3));
		System.out.println("The max is : "+max);
	}
}