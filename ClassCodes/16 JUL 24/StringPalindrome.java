//WAJP to find string is palindrome or not
import java.util.Scanner;
class StringPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name : ");
		String str = sc.next().toLowerCase();
		String nstr = "";
		for(int i =0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			 nstr =ch+nstr;		
		}
		System.out.println(nstr.equals(str)?"Palindrome":"Not a Palindrome");
	}
}