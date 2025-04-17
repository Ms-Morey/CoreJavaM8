//WAJP to print sum and product of the digits of a number;
import java.util.Scanner;
class Test5
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a 3 digit number : ");

		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		int product =0;

		int rem = num%10; //123%10 -> 3(rem)
		sum = sum+rem; // 0 + 3 -> 3
		product=rem*product;
		num = num/10; // 123/10 -> 3


		rem = num%10; // 12%10 -> 2
		sum = sum+rem; // 3 + 2 -> 5
		product=rem*product;
		num = num/10; // 12/10 -> 1

		rem = num%10; // 1%10 -> 1
		sum = sum+rem; // 5+1 -> 6
		product=rem*product;
		num = num/10; // 1/10 -> 0

		System.out.println("Sum of digits of a number " + dup +" is " +sum +" and Product is : "+product);
	}
}
	
