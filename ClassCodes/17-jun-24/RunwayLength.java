// 18 june 
// WaJP to find the length of a runway is (l = v2/2a), 'v' is take off speed and 'a' is acceleration speed
import java.util.Scanner;
class RunwayLength
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Take off Speed of a AirPlane in (m/s) : ");
		double v = sc.nextDouble();
		System.out.print("Enter the acceleration speed of AirPlane in (m/s^2) : ");
		double a = sc.nextDouble();

		double runway_Length = (v*v)/(2*a);

		System.out.println(" The minimum runway length for the airplane is "+runway_Length);


	}
}