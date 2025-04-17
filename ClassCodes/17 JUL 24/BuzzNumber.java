//WAJP to find a Buzz num 
// BUZZ no is is divisible by 7 or contains 7 at the end
import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = 47;
		int last =0;
		if((num%7)==0 || (num%10)==7)
		{
			System.out.println("it is a Buzz number");
		}
		else 
		{
			System.out.println("not a Buzz Number");
		}
	}
}