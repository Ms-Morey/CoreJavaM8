import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for(int j = 1; j<=10000; j++)
		{
			int num =j;
			int sum =0;

			for(int i =1; i<=num/2; i++)
			{
				if(num%i==0)
				{
					sum+=i;
				}
			}
			if(sum==num)
			{
				System.out.println(num+ " is a Perfect Number");
			}	
		}
	}
	
}