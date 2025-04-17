
// WAJP to check if boy is eligible to marry his gf
import java.util.Scanner;

class IfMarriage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the age : ");
		int age = sc.nextInt();
		System.out.print("Enter property : ");
		int property = sc.nextInt();
		System.out.print("Enter surname : ");
		String surname = sc.next().toLowerCase();

		if (age >= 21 && property >= 10000000 || age >= 21 && surname.equals("ambani")) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible");
		}
	}
}