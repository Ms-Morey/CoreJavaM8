import java.util.Scanner;
class NumberProgram2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count =0;
		int rev = 0;

		//check if enter number is prime or not
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		// if num is prime
		if(count==0)
		{
			// find the reverse of number
			while(num!=0)
			{
				int rem = num%10;
				rev = (rev*10)+rem;
				num/=10;
			}
			//chech if rev is prime or not
			int count1 =0;
			for(int j=2; j<rev; j++)
			{
				if(rev%j==0)
				{
					count1++;
					break;
				}
			}
			// chech if rev number is prime or not
			if(count1==0)
			{
				System.out.println("EMIRP NUMBER");
			}
			else
			{
				System.out.println("NOT AN EMIRP NUMBER");
			}
		}
		// if number is not prime
		else
		{
			System.out.println("NOT AN EMIRP NUMBER");
		}
	}
	
}