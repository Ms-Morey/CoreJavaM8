//EvenOdd
import java.util.Scanner;
class EvenOddUsingLOP
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
	

		String oddEven = num1%2 == 0? " is Even" : " is odd";
		System.out.println(num1 + " " +oddEven);
	}
}