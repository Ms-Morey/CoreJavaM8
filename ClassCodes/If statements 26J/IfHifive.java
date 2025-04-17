//WAJP to display if num is div by 5 if yes print HiFive and if div by 2 print HiEven
import java.util.Scanner;
class ifHifive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a num : ");
		int num = sc.nextInt();

		if(num%5==0){
			System.out.println("HiFive");
		}
		if(num%2==0){
			System.out.println("HiEven");
		}
	}
}