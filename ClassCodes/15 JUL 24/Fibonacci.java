import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Count : ");
		int count =sc.nextInt();
		int num1 =0;
		int num2 =1;
		System.out.print(num1+" "+num2+" ");

		for(int i =1; i<=count; i++)
		{
			int op = num1+num2;
			System.out.print(op+" ");
			num1 =num2;
			num2=op;
		}
	}
}