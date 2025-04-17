/*WAJP to read subtotal and gratuity rate them compute gratuity and total*/
import java.util.Scanner;
class GratuityCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the subtotal : ");
		double subtotal = sc.nextDouble();

		System.out.print("Enter the rate of gratuity : ");
		double rate = sc.nextDouble();

		double gratuity = subtotal*(rate/100);
		double total = subtotal + gratuity;

		System.out.println("The gratuity is "+ gratuity + " and total is "+ total);
	}
}