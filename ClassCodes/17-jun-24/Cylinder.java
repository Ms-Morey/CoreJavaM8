//find out the area and volume of an cylinder where radius = 5.5 and height is 12;
import java.util.Scanner;
class Cylinder
{
	public static void main(String[] args)
	{
		// Scanner sc = new Scanner(System.in);

		// System.out.print("Enter the Radius : ");
		// double radius = sc.nextDouble();
		// System.out.print("Enter the height : ");
		// double height = sc.nextDouble();

		double radius = 5.5;
		double height = 12;

		final double pi = 3.147;

		double area = pi * (radius*radius);
		System.out.println("Area of Cylinder is : " +area+" cm^2");

		double volume = area * height; //pi * (radius*radius)*height;
		System.out.println("Volume of Cylinder is : "+volume+ " cm^3");
	}
}