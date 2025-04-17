import java.util.Scanner;
class CustomInputMismatchException extends RuntimeException
{
	CustomInputMismatchException(String desc)
	{
		super(desc);
	}
}
class InMisMatExcep_Driver
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println(a.getClass());
	}
}