import java.util.Scanner;

class PrimeNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count = 0; // as the number is always divisible by 1 and itself.(i.e. it alway has 2 divisors.)
						 
		for (int i = 2; i < num/2; i++) 
		{
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
		
	}
}