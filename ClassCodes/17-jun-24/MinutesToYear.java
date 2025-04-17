//18 june 24 , WAJP to Convert minutes into years, (assume year is 365 days)
import java.util.Scanner;
class MinutesToYear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Minutes : ");
		int min = sc.nextInt();

		int no_days = min/1440;
		int no_year = no_days/365;
		int eDays = no_days -(no_year*365);

		System.out.println(min + " minutes is approximately "+ no_year+" years and "+eDays+" days");


	}
}