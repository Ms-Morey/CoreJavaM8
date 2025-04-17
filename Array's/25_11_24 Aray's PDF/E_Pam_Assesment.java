import java.util.*;
class E_Pam_Assesment
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Initial Energy : ");
		int initialEnergy = sc.nextInt();
		System.out.print("Enter the Rate per second : ");
		int rate = sc.nextInt();
		System.out.print("Enter Time : ");
		int time = sc.nextInt();


		int op = initialEnergy+(initialEnergy+rate)+(initialEnergy+rate+time);

	}
}