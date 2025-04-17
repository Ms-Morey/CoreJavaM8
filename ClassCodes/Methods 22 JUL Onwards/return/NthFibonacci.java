import java.util.Scanner;
class NthFibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println(num+" fibo number is "+nthFibo(num));
	}
	public static int nthFibo(int n)
	{	
		if(n==1)
			return 0;
		if(n==1)
			return 1;

		int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
	}
}