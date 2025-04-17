import java.util.Scanner;
class Calculator
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter an operator : ");
		char opr = sc.next().charAt(0);

		int output =0;
		
		if(opr == '+'){
			output = num1+num2;
		}
		else if(opr == '-'){
			output = num1-num2;
		}
		else if(opr == '*'){
			output = num1*num2;
		}
		else if(opr == '/'){
			output = num1/num2;
		}
		else if (opr == '%'){
			output = num1%num2;
		}
		else{
		System.out.println("Invalid Input !");
		}

		System.out.println(num1 + " " +opr+ " "+num2+ " = "+output);
		sc.close();;
	}
}