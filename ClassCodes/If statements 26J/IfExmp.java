// write if statement that assigns 1 to x if y is 0
import java.util.Scanner;
class IfExmp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value of Y : ");
		int y = sc.nextInt();
		int x;

		if(y>0){
			x=1;
			System.out.println("value of x is : "+x);
		}
	}
}