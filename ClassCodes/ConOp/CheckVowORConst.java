//JP to check Vov or Const
import java.util.Scanner;
class CheckVowORConst
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		String op = (ch=='a'|| ch =='e' || ch =='i' || ch =='o' || ch == 'u')? (ch+" is a vowel"):(ch+" is a consonent");
		System.out.println(op);
	}
}