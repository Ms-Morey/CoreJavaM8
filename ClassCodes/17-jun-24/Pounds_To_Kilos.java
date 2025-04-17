//17 june 24
// WAJP to conver pounds into kilos

import java.util.Scanner;
class Pounds_To_Kilos
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Pounds : ");
		double pounds = sc.nextDouble();

		double kilos = pounds * 0.454;
		System.out.println(pounds + " Pounds is "+ kilos +" Kilograms");
	}

}