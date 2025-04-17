/*Assume a runner runs 23 miles in 1 hour, 40 minutes and 35 seconds. 
WAJP the displays average speed in km per hour*/

class AverageSpeed
{
	public static void main(String[] args)
	{
		
		double miles = 24;

		double kilometers = miles * 1.6;
		System.out.println("Distance in kilometers is : "+kilometers +" km");
	
		double hours = 1;
		double minutes = 40.0/60;
		double seconds = 35.0/3600;

		double time = hours + minutes + seconds;
		System.out.println("Time Taken by runner is "+time+ " hours");


		double speed = kilometers/time;
		System.out.println("The Average speed of Runner is : " + speed + " km per hours");
	}
}