import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Age (in years): ");
		int age = sc.nextInt();
		System.out.print("Enter the weight (in kg) : ");
		double weight = sc.nextDouble();

		System.out.print("Any lcohol or Cigarette consumption in last 24 hours (Yes/No) : ");
		String consumption = sc.next().toLowerCase();	

		if(age>=20 && weight>50 && consumption.equals("no")){
			System.out.println("You can donate the blood ");
		}else{
			System.out.println("You cannot donate blood.");
		}
	}
}