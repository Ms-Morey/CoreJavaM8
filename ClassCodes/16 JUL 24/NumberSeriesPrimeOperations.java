//WAJP to print the following series next numbers 4,-13,37,-84
import java.util.Scanner;
class NumberSeriesPrimeOperations
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		int num =4;
		int count=0;
		int prev =0;

		for(int i=1; i<=range; i++)
		{
			count=0;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					count++;
				}

			}
			if(count==0)
			{
				if(i==2)
				{
					prev =i*i;
					System.out.println(4+" ,");
				}
				if(prev%2==0)
				{
					prev+=(i*i);
					System.out.println(prev);
				}
				else 
				{
					prev-=(i*i);
					System.out.println(prev);
				}
			}
			else
			{
				System.out.println(i+ " Is not a prime number");
			}
		}
			
	}
}