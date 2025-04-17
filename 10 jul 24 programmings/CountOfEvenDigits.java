import java.util.Scanner;
class CountOfEvenDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num =sc.nextInt();
		int count=0;

		while(num!=0)
		{
			int last =num%10;
			if(last%2==0)
			{
				count++;
			}
			num/=10;
		}
		System.out.println("The count of even digits in a num is : "+count);
	}
}