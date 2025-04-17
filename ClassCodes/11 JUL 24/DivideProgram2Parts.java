import java.util.Scanner;
class DivideProgram2Parts
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int div = 100;
		int count = 0;

		while(num>0)
		{
			count++;
			num/=10;
		}
		if(count%2==0)
		{
			int fh = dup/div;
			int lh = dup%div;
			System.out.print(fh+" "+lh);
		}
		else
		{
			System.out.println("Number cannot be divided into 2 equal parts");
		}
	}
}