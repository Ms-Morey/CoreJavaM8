import java.util.Scanner;
class Pattern12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup =num;

		for(int i=1; i<=4; i++)
		{
			for (int j=1;j<=i;j++) 
			{
				System.out.print(num+" ");
				num=num+dup;
			}
			System.out.println();
		}
	}
}