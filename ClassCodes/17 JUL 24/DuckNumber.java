import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String str = sc.next();

		for(int i =1; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(str.charAt(0)=='0')
			{
				System.out.println(" It is not a duck Number");
				break;
			}
			else if(str.charAt(i)=='0')
			{
				System.out.println("It is a Duck Number");
			}
		}
	}
}