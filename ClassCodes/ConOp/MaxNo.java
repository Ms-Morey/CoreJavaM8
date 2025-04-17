//max between 2 nums
import java.util.Scanner;
class MaxNo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
	

		int max = num1 > num2 ? num1 : num2;
		System.out.println("Max num is : "+max);
	}
}