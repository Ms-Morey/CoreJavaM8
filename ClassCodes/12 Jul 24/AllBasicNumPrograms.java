import java.util.Scanner;
class AllBasicNumPrograms
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int evensum =0;
		int sum =0;
		int oddsum =0;
		int count =0;
		int rem = 0;
		int rev =0;
		int evencount =0;
		int oddcount =0;
		String palindrome ="";

		System.out.print("Enter the num : ");
		//initlization
		int num = sc.nextInt();
		int dup =num;

			//Condition
		while(num>0)
		{
			count++; // count of digits in a number

			rem =num%10;//extracting the last digit of a number

			sum +=rem;//sum of all digits of a number
			rev =(rev*10)+rem;// reverse of number

			if(rem%2==0)//condition for finding even digits of a number
			{
				evencount++;//count of even digits of a numbers
				evensum+=rem;//sum of even digits of a numbers
			}
			else
			{
				oddcount++;// count of odd digits of a  numbers
				oddsum+=rem;// sum of odd digits of a numbers
			}
			// to chech palindrome or not
			palindrome =(rev == dup)?dup+" is a palindrome":dup+ " is not a palindrome";
			
			//Updation
			num/=10; //removal of a last digit of a number
		}
		System.out.println("Count of digits of a number is : "+count);
		System.out.println("Sum of the digits of a number is : "+sum);
		System.out.println();
		System.out.println("Count of Even numbers is : "+evencount);
		System.out.println("Count of Odd numbers is : "+oddcount);
		System.out.println();
		System.out.println("Sum of Even digits in a number is  : "+ evensum);
		System.out.println("Sum off Odd digits in a number is : "+oddsum);
		System.out.println("Reverse of a number is : "+rev);
		System.out.println(palindrome);
	}
}