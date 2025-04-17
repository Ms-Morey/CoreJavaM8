// Step 1 : import Scanner class
import java.util.Scanner;
class Addition 
	{
		public static void main(String [] args)
		{
		   //Step 2: Creating an obj of Scanner and storing inside a ref var
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a num1 : ");
		   //Step 3: Invoking the methods of Scanner using ref var
			int num1 = sc.nextInt();
			System.out.print("Enter a num2 : ");
			int num2 = sc.nextInt();
			int addition = num1+num2;
			System.out.println("Addition is : "+ addition);
		}
	}