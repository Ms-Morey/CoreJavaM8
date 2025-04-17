import java.util.Scanner;
class Circle
	{
	 	public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a radius (cm) : ");
			double radius = sc.nextDouble();

			final double pi = 3.147;
			
			double perimeter = 2 * pi * radius;
			double area = pi * (radius * radius);
			System.out.println("Perimeter of Circle is "+ perimeter +"cm");
			System.out.println("Area of Circle is "+ area +"cm^2");
		}
	}