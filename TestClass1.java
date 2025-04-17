import java.util.Scanner;
class TestClass
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;

		System.out.print("Enter the Value of a : ");
		int a = sc.nextInt();

		System.out.print("Enter the Value of b : ");
		int b = sc.nextInt();

		System.out.println("Numbers Before swapping");
		System.out.println("a->"+a);
		System.out.println("b->"+b);

		//With Using 3rd variable
		// int temp = a;
		//   	   a = b; 
		//   	   b =temp;

		// Without using 3rd Variable

			a = a+b;
			b = a-b;
			a = a-b;

		System.out.println("Numbers After swapping");
		System.out.println("a->"+a);
		System.out.println("b->"+b);		
	
		sc.close();

	}
}