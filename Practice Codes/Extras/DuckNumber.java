//a number which has atleast one zero in it , 
//Zero must not be in the begining of the Number 
import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		// String numStr = sc.next();

		int num = sc.nextInt();
		System.out.println(isEmirpNumber(num));

		// System.out.println(isDuckNumber(numStr));
	}


	private static boolean isDuckNumber(String numStr)
	{
		if((numStr.contains("0")) && numStr.charAt(0)!='0')
			return true;
		
		return false;
	}

	private static boolean spyNumber(int num)
	{
		int sum = 0;
		int prod = 1;
		while(num!=0)
		{
			int rem = num%10;
			sum+=rem;
			prod*=rem;
			num/=10;
		}
		return (sum==prod);
	}

	private static boolean isEmirpNumber(int num)
	{
		if(isPrime(num) && isPrime(reverseNumber(num)))
			return true;
		return false;
	}

	private static boolean isPrime(int num)
	{	
		if(num<2)
			return false;
		for(int i =2; i<=num/2; i++)
			if(num%i==0)
				return false;
		return true;
	}

	private static int reverseNumber(int num)
	{
		String str = num+"";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String newStr = new String(sb);
		int revNum = Integer.parseInt(newStr);
		return revNum;
	}
}