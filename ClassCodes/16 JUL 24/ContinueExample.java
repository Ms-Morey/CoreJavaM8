import java.util.Scanner;
class ContinueExample
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name : ");
		String str = sc.next();
		for(int i =0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			System.out.println(ch);
		}
	}
}