import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a num : ");
		int num = sc.nextInt();

		int factors=0;

		if(num==0 || num ==1)
		{
			System.out.println("is not a prime Numbers.");
		}
		else{
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
				{
					factors++;
				}
			}
			if(factors==0) 
			{
				System.out.println(num+" is a prime number.");
			}
			else
			{
				System.out.println(num+ " is not a prime number.");
			}
		}
	}
}