import java.util.Scanner;
class DrivingEligibility
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Age : ");
		int age = sc.nextInt();
		System.out.print("Enter the RTO test marks : ");
		int rto_test_marks = sc.nextInt();

		if(age<18 || rto_test_marks<60){
			System.out.println("Please re-apply for the licence.");
		}
		if(age>=18 && rto_test_marks>=60){
			System.out.println("You are eligible to drive.");
		}
	}
}