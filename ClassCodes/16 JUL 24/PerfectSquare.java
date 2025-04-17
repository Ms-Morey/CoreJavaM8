import java.util.Scanner;
class PerfectSquare
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		boolean flag =false;
		for(int i =1; i<=num/2; i++)
		{
			if((i*i)==num)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("It  is a PerfectSquare");
		}
		else
		{
			System.out.println("Not a PerfectSquare");
		}
	}
}