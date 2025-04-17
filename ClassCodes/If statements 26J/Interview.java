import java.util.Scanner;
class Interview
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);

		System.out.print("Percentage  : ");
		int percentage  = sc.nextInt();

		if(percentage>=60){
			System.out.println("You are Eligible for interview");
		}
		else{
			System.out.println("you are not Not Eligible for interview");
		}
	}
}