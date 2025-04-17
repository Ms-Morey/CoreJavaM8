// WAJP to find a year is leap or not
import java.util.Scanner;
class LeapYearOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the year : ");
		int year = sc.nextInt();

		String op =(year%4==0 && year%100!=0)?(year +" is a leap year."):((year%400 == 0)?(year +" is a leap year"):(year+" is not a leap year"));
		
		System.out.println(op);
	}
}