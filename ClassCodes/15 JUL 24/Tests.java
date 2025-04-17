import java.util.Scanner;
class Tests
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num = sc.nextInt();
		// int dup = num;
		// int sum =0;

		// while(num!=0)
		// {
		// 	int rem = num%10;
		// 	int fact=1;
		// 	for(int i =1; i<=rem; i++)
		// 	{
		// 		fact*=i;
		// 	}

		// 	sum+=fact;
		// 	num/=10;
		// }
		// System.out.println(sum);
		// if(dup == sum)
		// {
		// 	System.out.println(dup+ " is a Peterson Number.");
		// }

		//Perfect Number
		int sum  =0;
		for(int i =1; i<=num/2; i++)
		{
			if (num%i==0) 
			{
				sum+=i;
			}
		}
		if(sum == num)
		{
			System.out.println(num+ " is a perfect number");
		}



	}
}