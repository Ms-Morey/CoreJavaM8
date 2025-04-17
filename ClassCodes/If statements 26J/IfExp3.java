// write if statement that increase pay by 3% if score is greater than 90 and 1 % if not.
import java.util.Scanner;
class IfExp3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the score : ");
		int score = sc.nextInt();
		System.out.print("Enter the pay : ");
		int pay = sc.nextInt();

		if(score>90){
			pay = pay+(pay*3/100);
			System.out.println("The increase pay by 3% is "+pay);
		}
		if(score<=90){
			pay = pay+(pay*1/100);
			System.out.println(("The increased pay by 1% is "+pay));
		}
	}
}