// 18 june 24 , 123 = 321
import java.util.Scanner;
class ReverseNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a 3 digit number : ");
		
		int num = sc.nextInt();
		int dup = num;
		int rev = 0;

		int rem = num%10; // 123%10 -> 3
		rev =(rev*10)+rem; // (0*10)+3 = 3
		num = num/10;	// 123/10 -> 12 
		
		rem = num%10; // 12%10 ->2
		rev =(rev*10)+rem; // (3*10)+2 -> 32
		num = num/10; // 12/10 -> 1

		rem = num%10; // 1%10 -> 1
		rev =(rev*10)+rem; //(32*10)+1 -> 321
		num = num/10; // 1/10 -> 0
		
		System.out.println("Reverse of "+ dup +" is " +rev);
	}
}