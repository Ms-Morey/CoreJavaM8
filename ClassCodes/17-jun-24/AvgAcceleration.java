/*WAJP to display avg acceleration m/s by taking input from user, 
stating velocity 'v0' and ending velocity as 'v1' and time span in seconds is 't'*/
import java.util.Scanner;
class AvgAcceleration
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the initial velocity v0 : ");
		double v0 = sc.nextDouble();

		System.out.print("Enter the ending velocity v1 : ");
		double v1 = sc.nextDouble();

		System.out.print("Enter the time in (sec) : ");
		double time = sc.nextDouble();

		double avg_Aclr = (v1-v0)/time;

		System.out.println("The average acceleration is "+ avg_Aclr);



	}
}