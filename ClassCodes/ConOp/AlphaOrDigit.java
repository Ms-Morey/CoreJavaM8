//Alphabate or Digits
import java.util.Scanner;
class AlphOrDigit
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character  : ");
		char ch = sc.next().charAt(0);
		
		String op = (ch>='0' && ch<='9')?(ch +" is a digit"):((ch>='A' && ch <='Z' || ch>='a' && ch<='z'))?(ch + " is a character"):("Invalid Input");
		System.out.print(op);
		
	}
}