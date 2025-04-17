// 18 jine
/*WAjP to cal. energy needed to heat the water from initial temp to the final temp. amt of water is given in kilograms. & initial & final temp of water is also there.*/

import java.util.Scanner;

class EnergyCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the ammount of water in kilos : ");
	    double weightOfWater_M = sc.nextDouble();

	    System.out.print("Enter the initial temperature in degrees celsius : ");
	    double initialTemp = sc.nextDouble();

	    System.out.print("Enter the final temperature degree celcius : ");
	    double finalTemp = sc.nextDouble();

		double energyQ = weightOfWater_M*(finalTemp - initialTemp)*4184;
		System.out.println("The energy needed is "+ energyQ +" joules.");
	}
}