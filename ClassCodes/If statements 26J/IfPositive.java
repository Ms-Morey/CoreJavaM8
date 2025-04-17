// write if statement that check num is positive
import java.util.Scanner;
class IfPositive
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the num : ");
		int num = sc.nextInt();

		if(num > 0){
			System.out.println(num +" is Positive");
		}
	}
}