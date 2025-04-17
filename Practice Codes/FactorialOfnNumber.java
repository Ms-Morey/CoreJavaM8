// WAJP to  find out first n odd natural numbers
import java.util.Scanner;
class FactorialOfnNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i =2; i<=n; i++)
		{
			factorial*=i;
		}
		System.out.println("The factorial of "+n+" is : "+ factorial);
	}
}