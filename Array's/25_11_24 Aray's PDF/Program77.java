import java.util.*;
class Program77
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number : ");
			System.out.println(countOfTrailinZeros(factorial(sc.nextInt())));
	}

	public static int countOfTrailinZeros(int num)
	{
		int count = 0;
		int cntOfIterations = 0;
		while(num!=0)
		{
			if((num%10)==0 && cntOfIterations==count)
				count++;
			cnt++;
			num/=10;
		}
		return count;
	}
	public static int factorial(int num)
	{
		int fact =1;
		for(int i =1; i<=num; i++)
			fact*=i;
		return fact;
	}
}