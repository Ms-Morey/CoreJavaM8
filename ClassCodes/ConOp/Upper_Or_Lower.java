// WAJP to find alphabet is upper case of lower case
import java.util.Scanner;
class Upper_Or_Lower
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Eneter a character : ");
		char ch = sc.next().charAt(0);

		String op = (ch>='A' && ch<='Z')?(ch + " is Upper case."):(ch>='a' && ch<='z')?(ch +" is a Lower case."):("Invalid Input");
		System.out.println(op);
	}
}