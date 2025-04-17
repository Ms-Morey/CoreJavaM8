import java.util.Scanner;
class EvenOddWithoutMod
	{
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int num = sc.nextInt();

			if((num/2)*2==num)
			{
			System.out.println(num +" is Even");
			}
			else 
			{
				System.out.println(num +" is Odd");
			}
		}
	}