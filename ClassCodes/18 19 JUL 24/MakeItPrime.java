//WAJP to make a number a prime if it's not a prime then make it a prime
import java.util.Scanner;
class MakeItPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num =sc.nextInt();
		int dup =num;
		int add =0;

		for (; ; ) 
		{
			int count =0;
			for(int i = 2; i<=dup/2; i++)
			{
				if(dup%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				add = dup-num;
				System.out.println("We need to add "+add+" to make it a prime number");
				break;
			}
			dup++;
		}
		System.out.println("The number after making it a prime is : "+ (num+add));
	}
}