//WAJP to extract the last digit from a given number
import java.util.Scanner;
class Test3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		int lastDigit =num%10;

		System.out.println("The last digit of a number is : "+lastDigit);

	}
}