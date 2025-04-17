import java.util.Scanner;
class ArmyRequirements
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Age : ");
		int age = sc.nextInt();
		System.out.print("Enter the height (in cm) : ");
		int height = sc.nextInt();
		System.out.print("Enter the weight (in kg) : ");
		int weight = sc.nextInt();

		if(age>18 && height >=162 && weight>56)
			System.out.println("You can join the indian army.");
	}
}