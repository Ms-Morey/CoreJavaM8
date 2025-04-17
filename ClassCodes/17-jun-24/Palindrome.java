// 18 june 24 Palindrome 121 == 121
import java.util.Scanner;
class Palindrome
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a 3 digit number : ");
		
		int num = sc.nextInt();
		int dup = num;
		int rev = 0;

		int rem = num%10;
		rev =(rev*10)+rem;
		num /= 10;
		
		rem = num%10; 
		rev =(rev*10)+rem; 
		num /= 10; 

		rem = num%10; 
		rev =(rev*10)+rem; 
		num /= 10; 
		
		if( dup == rev ){
			System.out.println(dup + " is a Palindrome number.");
		}
		else{
			System.out.println(dup + " is not a Palindrome number.");
		}

	}
}