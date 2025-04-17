//WAJP to filter the entered string and remove special characters of numbers from it.
import java.util.Scanner;
class ContinueCharRemove
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name : ");
		String str = sc.next();
		String nstr ="";
		for(int i =0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)))
				continue;
				nstr+=ch;		
		}
		System.out.println(nstr);
	}
}