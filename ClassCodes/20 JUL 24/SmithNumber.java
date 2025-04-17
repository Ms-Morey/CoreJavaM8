import java.util.Scanner;
//167 is not a smith number fix it
class SmithNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt(); //94  166 are two smith number
		int sum = 0;

		for(int i = 2; i<=num; i++)
		{
			if(num%i==0)
			{
				int count = 0;
				for(int j =2; j<i/2; j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==0)
				{
					int num1 =i;
					while(num1>0)
					{
						sum+=(num1%10);
						num1/=10;
					}
				}
			}
		}
		int sum1 =0;
		while(num>0)
		{
			sum1+=(num%10);
			num/=10;
		}
		
		System.out.println(sum==sum1?"It is a Smith Number": "It is not a Smith number");
	}
}