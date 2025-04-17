// 18 june 24 123 = 1+2+3 = 6
import java.util.Scanner;
class SumOfDigits
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a 3 digit number : ");

		int num = sc.nextInt();
		int dup = num;
		int sum = 0;

		int rem = num%10; //123%10 -> 3(rem)
		sum = sum+rem; // 0 + 3 -> 3
		num = num/10; // 123/10 -> 3

		rem = num%10; // 12%10 -> 2
		sum = sum+rem; // 3 + 2 -> 5
		num = num/10; // 12/10 -> 1

		rem = num%10; // 1%10 -> 1
		sum = sum+rem; // 5+1 -> 6
		num = num/10; // 1/10 -> 0

		System.out.println("Sum of digits of a number " + dup +" is " +sum);
	}
}