// 17 jun 24
// WAJP  to conver temprature from Celcius to Fahrenheit.
import java.util.Scanner;
class Cels_To_Far
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter degree in Celcius : ");
		double celcius = sc.nextDouble();

		double fahrenheit = (9.0/5) * celcius + 32;
		System.out.println(celcius +" Celcius is "+fahrenheit + " Fahrenheit");
		sc.close();
	}

}
