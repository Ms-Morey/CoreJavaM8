import java.util.Scanner;
class AutoMorphicNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup =num;
		int count =0;
		int sqr = num*num;

		while(dup>0)
		{
			count++;
		}
		int div =1;
		while(count>0)
		{
			div*=10;
			count--;
		}
		int lastDigit =sqr%div;

		if(lastDigit == num)
		{
			System.out.println(num+" is a AutoMorphic Number");
		}
		else
		{
			System.out.println((num+" is not a Automorphic number"));
		}

	}
	
}