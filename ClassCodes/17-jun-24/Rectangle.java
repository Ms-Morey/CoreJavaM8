// june 17 hw
// Find the Area and perimeter of an rectangle
// import java.util.Scanner;
class Rectangle
{
	public static void main(String[] args) 
	{
		// Scanner sc = new Scanner(System.in);
	
		// System.out.print("Enter the width of an Rectangle : ");//4.5cm
		// double width = sc.nextDouble();
		// System.out.print("Enter the height of an Rectangle : ");//7.9cm
		// double height = sc.nextDouble();

		double width = 4.5;
		double height = 7.9;

		double perimeter = 2*(width + height);
		System.out.println("The perimeter of an Rectangle is : " +perimeter+" cm");
		double area = width * height;
		System.out.println("The area of an Ractangle is : "+area+" cm^2");
	}
}