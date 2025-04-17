import java.util.Scanner;
class PetersonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int num =sc.nextInt();// 145
		int dup = num;
		int sum =0;
		for(int j =1; j<=10000; j++)
		{
			while(dup!=0)
			{
				int rem=dup%10;
				int fact =1;
				for(int i=1; i<=rem; i++)
				{
					fact*=i;
				}

				sum+=fact;
				dup/=10;

			}
			if(sum==num)
			{
				System.out.println(num+ " is a Peterson Number");
			}
		}
	}
	
}