import java.util.Scanner;
class Calculator
{
	public static int addition(int a , int b)
	{
		return a+b;
	}
	public static int subtraction(int a , int b)
	{
		return a-b;
	}
	public static int division(int a , int b)
	{
		return a/b;
	}
	public static int multiplication(int a , int b)
	{
		return a*b;
	}
	public static int modulo(int a , int b)
	{
		return a%b;
	}

	public void cal(int a ,char option, int b)
	{	
		switch(option)
		{
			case '+': 
					{
						System.out.println(addition(a,b));
						break;
					}
			case '-': 
					{
						System.out.println(subtraction(a,b));
						break;
					}
			case '*': 
					{
						System.out.println(multiplication(a,b));
						break;
					}
			case '/': 
					{
						System.out.println(division(a,b));
						break;
					}
			case '%': 
					{
						System.out.println(modulo(a,b));
						break;
					}
			default :
					{
						System.out.println("Wrong Inputs");
					}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Operator : ");
		char op = sc.next().charAt(0);
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();

		Calculator c = new Calculator();

		c.cal(num1, op, num2);
	}
}