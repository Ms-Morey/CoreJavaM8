// 17 june hw
// WAJP to convert feet into meters where 1 foot = 0.305;
import java.util.Scanner;
class Foot_To_Meter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Value of Foot : ");
		double feet = sc.nextDouble();//16.5

		//Conversion of foot to meter
		double meter = feet * 0.305;
		System.out.println(feet + " feet is "+meter+" meters");//5.0325
	}
}