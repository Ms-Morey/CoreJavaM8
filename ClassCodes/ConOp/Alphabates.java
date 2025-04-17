//Alphabate or not
import java.util.Scanner;
class Alphabates
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character  : ");
		char ch = sc.next().charAt(0);
		
		String op = ((ch>='A' && ch <='Z' || ch>='a' && ch<='z'))?(ch+" is an alphabate"):(ch+" is not an alphabate");

		System.out.print(op);
		
	}
}