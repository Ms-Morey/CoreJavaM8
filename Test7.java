//write a java program to check digits of a number , if the digits of count number are even then they can be divided into 2 parts.
import java.util.Scanner;
class Test7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count=0;

		while(num!=0) 
		{
			int rem = num%10;
			count+=1;
			num =num/10;
		}

		if(count%2==0)
		{
			System.out.println("Number can be divided into 2 equal parts.");
		}
		else{
			System.out.println("No. cannot be divided into 2 eqaul parts.");
		}
		
	}
}