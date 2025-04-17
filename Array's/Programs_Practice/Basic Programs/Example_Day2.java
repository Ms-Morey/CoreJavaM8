class Example_Day2
{
	public static void main(String[] args) 
	{
		// leapYearInRange(2000,3000);
		// System.out.println(sumOfNaturalNoInRange(0,10));
		// System.out.println(reveseNumber(1234));
		// System.out.println(isPalindrome(11111111));
		// factorsOfNo(81);
		// System.out.println(isPrime(0));
		// fiboSeries(10);
		System.out.println(isFibo(34));
	}

	public static void leapYearInRange(int start, int end)
	{
		for(int i=start; i<=end; i++)
		{
			if(isLeapYear(i))
				System.out.println(i);
		}
	}
	public static boolean isLeapYear(int year)
	{
		if(year%100 == 0 && year%400 == 0 || year%100!=0 && year%4==0)
			return true ;
		else
			return false;
	}

	public static int sumOfNaturalNoInRange(int start, int end)
	{
		int sum = 0;
		if(start == 0)
		{
			start+=1;
		}
		for(int i = start; i<= end; i++)
		{
			sum+=i;
		}
		return sum;
	}

	public static int reveseNumber(int num)
	{
		int rev = 0;
		while(num!=0)
		{
			rev=(rev*10)+(num%10);
			num/=10;
		}
		return rev;
	}

	public static boolean isPalindrome(int num)
	{
		if(num==reveseNumber(num))
			return true;
		return false;
	}

	public static void factorsOfNo(int num)
	{
		for(int i = 1; i<=num; i++)
		{
			if(num%i==0)
				System.out.println(i);
		}
	}

	public static boolean isPrime(int num)
	{
		if(num<=0)
			return false;
		else
			for(int i = 2; i<=num/2; i++)
				if(num%i==0)
					return false;
			return true;
	}

	public static void fiboSeries(int num)
	{
		int prev = 0;
		int curr = 1;
		System.out.print(prev+","+curr+",");
		for(int i = 2; i<num; i++)
		{
			int next = prev+curr;
			prev = curr;
			curr=next;

			System.out.print(next+",");
		}
	}

	public static boolean isFibo(int num)
	{
		if(num==0 || num == 1)
			return true;
		int prev = 0;
		int curr = 1;
		int next=0;
		for(int i = 2;next<num; i++)
		{
			next = prev+curr;
			prev = curr;
			curr=next;
		}
		if(next == num)
			return true;
		return false;
	}
}