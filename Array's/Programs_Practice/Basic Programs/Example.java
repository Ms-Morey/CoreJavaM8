import java.util.Scanner;
class Example
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		// System.out.println(countOfDigits(num));
		// extractDigitsOfNumber(num);
		// evenOdd(num);
		// sumOfEvenOddDigits(num);
		// System.out.println(factorial(num));
		// System.out.print("Enter power of number :");
		// int pow = sc.nextInt();
		// System.out.println(powerOfNumber(num,pow));

		// swappintTwoNumbers(num,pow);
		// System.out.println(sumOfDigits(num));
		// System.out.println(reverseANumber(num));
		// isPerfectSquar(num);
	}

	public static int countOfDigits(int num)
	{
		int count =0;

		while(num!=0)
		{
			count++;
			num/=10;
		}
		// for( ; num!=0; num/=10)
		// {
		// 	count++;
		// }

		return count;
	}

	public static void extractDigitsOfNumber(int num)
	{
		while(num!=0)
		{
			int digit = num%10;
			num/=10;
			System.out.println(digit+",");
		}
	}

	public static void evenOdd(int num)
	{
		if(num%2==0)
			System.out.print(num+" is even");
		else 
			System.out.println(num+" is odd");
	}

	public static void sumOfEvenOddDigits(int num)
	{
		int sumOfEven = 0;
		int sumOfOdd = 0;
		while(num!=0)
		{
			int digit = num%10;
			if(digit%2==0)
				sumOfEven+=digit;
			else
				sumOfOdd+=digit;
			num/=10;
		}
		System.out.println("Sum of Even Digits  is : "+sumOfEven);
		System.out.println("Sum of Odd Digits is : "+sumOfOdd);
	}

	public static int factorial(int num)
	{
		int fact = 1;
		for(int i =1; i<=num; i++)
		{
			fact*=i;
		}
		return fact;
	}

	public static int powerOfNumber(int num, int pow)
	{
		int power = 1;
		for(int i=1; i<=pow;i++)
		{
			power*=num;
		}
		return power;
	}


	public static void swappintTwoNumbers(int a, int b)
	{
		System.out.println("Value of A is : "+a);
		System.out.println("Value of B is : "+b);
		// using 3rd variable
		// int c = a;
		// 	a=b;
		// 	b=c;

		//Without using 3rd Variable
		a+=b;
		b=a-b;
		a-=b;
			System.out.println("Value of A after Swapping : "+a);
			System.out.println("Value of B after Swapping : "+b);
	}


	public static int sumOfDigits(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}


	public static int reverseANumber(int num)
	{
		int rev = 0;
		while(num!=0)
		{
			rev = (rev*10)+(num%10);
			num/=10;
		}
		return rev;
	}

	// public static int squareRoot(int num)
	// {
			// except squar root
	// }


	public static void isPerfectSquar(int num)
	{
		if(perfectSquare(num))
			System.out.println(num+" is Perfect perfect Square");
		else
			System.out.println(num+" is not Perfect Square");
	}
	public static boolean perfectSquare(int num)
	{
		for(int i =1; i<num/2;i++)
		{
			if(i*i==num)
				return true;
		}
		return false;
	}

	//13 programs doene
}