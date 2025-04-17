import java.util.Scanner;
class Patterns
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		nNoOfPrimes(num);
		// dividNumber(1234756);
		// System.out.println(reverseNumber(123456));
		// System.out.println(powerOfNumber(5,3));
		// System.out.println(sumOfDigits(123456789));
		// allPattern(5);
		// trianglePattern_3(5);
	}

	// public static boolean isPrime(int num)
	// {
	// 	for(int i = 2; i<=num/2; i++)
	// 	{
	// 		if(num%i==0)
	// 		{
	// 			return false ;
	// 		}
	// 	}
	// 	return true ;
	// }

	// public static void trianglePattern_1(int num)
	// {
	// 	for(int i = 1; i<=num; i++)
	// 	{
	// 		for(int j = 1; j<=i; j++)
	// 		{
	// 			System.out.print(" * ");
	// 		}
	// 		System.out.println();
	// 	}
	// }



	// public static void trianglePattern_2(int num)
	// {
	// 	for(int i = 1; i<=num; i++)
	// 	{
	// 		for(int j = num; j>=i+1; j--)
	// 		{
	// 			System.out.print("   ");
	// 		}
	// 		for(int k = 1; k<=i; k++)
	// 		{
	// 			System.out.print(" * ");
	// 		}
	// 		System.out.println();
	// 	}
	// }



	// public static  void trianglePattern_3(int num)
	// {
	// 	for(int i = 1; i<=num; i++)
	// 	{
	// 		for(int j = 1; j<=i-1; j++)
	// 		{
	// 			System.out.print("   ");
	// 		}
	// 		for(int k=num; k>=i; k--)
	// 		{
	// 			System.out.print(" * ");
	// 		}
	// 		System.out.println();
	// 	}
	// }


	// public static void trianglePattern_4(int num)
	// {
	// 	for(int i = 1; i<=num; i++)
	// 	{
	// 		for(int j=num; j>=i; j--)
	// 		{
	// 			System.out.print(" * ");
	// 		}
	// 		System.out.println();
	// 	}
	// }


	// public static void allPattern(int num)
	// {
	// 	for(int i = 1; i<=num-1; i++)
	// 	{
	// 		for(int j = num; j>=i+1; j--)
	// 		{
	// 			System.out.print("   ");
	// 		}
	// 		for(int k = 1; k<=i; k++)
	// 		{
	// 			System.out.print(" * ");
	// 		}
	// 		for(int j = 1; j<=i-1; j++)
	// 		{
	// 			System.out.print(" * ");
	// 		}
	// 		System.out.println();
	// 	}
	// 	for(int i = 1; i<=num; i++)
	// 	{
	// 		for(int j = 1; j<=i-1; j++)
	// 		{
	// 			System.out.print("   ");
	// 		}
	// 		for(int k=num; k>=i; k--)
	// 		{
	// 			System.out.print(" * ");
	// 		}
	// 		for(int j=num-1; j>=i; j--)
	// 		{
	// 			System.out.print(" * ");
	// 		}
	// 		System.out.println();
	// 	}
		
	// }


	// public static int factorial(int num)
	// {
	// 	int fact =1;
	// 	for(int i =1; i<=num; i++)
	// 	{
	// 		fact*=i;
	// 	}
	// 	return fact;
	// }

	// public static int countOfDigits(int num)
	// {
	// 	int count = 0;
	// 	for(int i=num; i!=0; i/=10)
	// 	{
	// 		count++;
	// 	}
	// 	return count ;
	// }

	// public static int sumOfDigits(int num)
	// {
	// 	int sum = 0;
	// 	while(num!=0)
	// 	{
	// 		sum = sum+(num%10);
	// 		num/=10;
	// 	}
	// 	return sum;
	// }


	// public static int powerOfNumber(int num, int pow)
	// {
	// 	int power = 1;
	// 	while(pow!=0)
	// 	{
	// 		power*=num;
	// 		pow--;
	// 	}
	// 	return power;
	// }

	// public static int reverseNumber(int num)
	// {
	// 	int rev = 0;
	// 	while(num!=0)
	// 	{
	// 		rev = rev*10+(num%10);
	// 		num/=10;
	// 	}
	// 	return rev;
	// }


	// public static boolean canBeDivided(int num)
	// {
	// 	int count = countOfDigits(num);
	// 	if(count%2==0)
	// 	{
	// 		return true;
	// 	}
	// 	return false;
	// }

	// public static void techNumber(int num)
	// {
	// 	int dup = num ;
	// 	int sqr = 0;
	// 	int count = countOfDigits(num);
	// 	if(canBeDivided(num))
	// 	{
	// 		int div = 1;

	// 	 for(int i = 1; i<=count/2; i++)
	// 	 {
	// 	 	div*=10;
	// 	 	int lsD = dup/div;
	// 	 	int rsD = dup%div;
	// 	 	int add = lsD + rsD;
	// 	 	sqr = add*add;
	// 	 }
	// 	System.out.println((sqr==dup)?" Is a tech Number":" Is not a tech number");

	// 	}
	// 	else
	// 	{
	// 		System.out.println("Number is Not a tech Number");
	// 	}
	// }

	// public static void fibo(int num)
	// {
	// 	int prev = 0;
	// 	int current = 1;
	// 	System.out.print(prev+",");
	// 	System.out.print(current+",");
	// 	for(int i = 3; i<=num; i++)
	// 	{
	// 		int next = prev+current;
	// 		System.out.print(next+",");
	// 		prev = current;
	// 		current = next;
	// 	}

	// }

	public static boolean isPrime(int num)
	{
		for(int i =2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

	// public static void isEmiRpNumber(int num)
	// {
	// 	if(isPrime(num) && isPrime(reverseNumber(num)))
	// 	{
	// 		System.out.println("Number is is EmiRpNumber");
	// 	}
	// 	else
	// 	{
	// 		System.out.println(num+" is not a isEmiRpNumber");
	// 	}
	// }

	// public static void factors(int num)
	// {
	// 	for(int i = 1; i<=num/2; i++)
	// 	{
	// 		if(num%i==0)
	// 		{
	// 			System.out.println(i+",");
	// 		}
	// 	}
	// }

	// public static void everDigitsInNumber(int num)
	// {
	// 	while(num!=0)
	// 	{	
	// 		int digit = num%10;
	// 		if(digit%2==0)
	// 		{
	// 			System.out.println(digit);
	// 		}
	// 		num/=10;
	// 	}
	// }

	// public static int squareRoot(int num)
	// {
	// 	for(int i = 1; i<=num/2; i++)
	// 	{
	// 		if((i*i)==num)
	// 		{
	// 			return i;
	// 		}
	// 	}
	// 	return num;	
	// }

	// public static void autoMorphicNumber(int num)
	// {	// It is a number where the number's square's last digits are equal to the number		
	// 	int count = countOfDigits(num);
	// 	int div = 1;
	// 	while(count!=0)
	// 	{
	// 		div*=10;
	// 		count--;
	// 	}
	
	// 	int last_digits = (num*num)%div;
	// 	System.out.println(last_digits);
	// 	if(num==last_digits)
	// 	{
	// 		System.out.println("It is an autoMorphicNumber");
	// 	}
	// 	else
	// 	{
	// 		System.out.println("It is not an automorphic number");
	// 	}
	// }

	
	// public static boolean armStrongNumber(int num)
	// {
	// 	int powerSum = 0;
	// 	int rem = 0;
	// 	int count = countOfDigits(num);
	// 	int dup = num;
	// 	while(num!=0)
	// 	{
	// 		rem = num%10;
	// 		powerSum += powerOfNumber(rem,count);
	// 		num/=10;
	// 	}
		
	// 	if(powerSum==dup)
	// 	{
	// 		return true;
	// 	}
	// 	return false; 
	// }


	// public static void armStrongInRange(int start, int end)
	// {
	// 	for(int i = start; i<=end; i++)
	// 	{
	// 		if(armStrongNumber(i))
	// 		{
	// 			System.out.println(i);
	// 		}
	// 	}
	// }


	// public static void first_ArmstrongNumbers(int num)
	// {
	// 	int count=0;
	// 	int i=100;
	// 	while(true)
	// 	{
	// 		if(armStrongNumber(i))
	// 		{
	// 			System.out.print(i+",");
	// 			count++;
	// 		}
	// 		if(count>=num)
	// 		{
	// 			break;
	// 		}
	// 		i++;
	// 	}
	// }

	// public static void nNoOfPrimes(int num)
	// {	int count =1;
	// 	// for(int i = 1;count<=num;i++)
	// 	// {
	// 	// 	if(isPrime(i))
	// 	// 	{
	// 	// 		System.out.print(i+",");
	// 	// 		count++;
	// 	// 	}
			
	// 	// }
	// 	int i = 1;
	// 	while(count<=num)
	// 	{
	// 		if(isPrime(i))
	// 		{
	// 			System.out.print(i+",");
	// 			count++;
	// 		}
	// 		i++;
	// 	}
	// }

}
