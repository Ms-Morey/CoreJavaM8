import java.util.Scanner;
class CustomArithmeticException extends RuntimeException
{
	CustomArithmeticException(){

	}
	CustomArithmeticException(String desc)
	{
		super(desc);
	}
}

class UserDefineExceptionDriver
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		char ch = sc.next().charAt(0);

		if(ch !='/')
		{
			System.out.println("Operation other than division");
		}
		else{

			if(b == 0)
			{
				throw new CustomArithmeticException("Cannot divide with zero");
			}
			else{
				System.out.println(a/b);
			}
		}

	}
}