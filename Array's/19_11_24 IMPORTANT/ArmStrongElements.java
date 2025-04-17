import java.util.*;
class ArmStrongElements
{
	public static void main(String[] args) 
	{
		int [] arr = new int[args.length];

		for(int i =0; i<args.length; i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		for(int i:arr)
		{
			if(isArmstrong(i))
				System.out.println(i+" is ArmStrong");
		}
	}

	public static boolean isArmstrong(int num)
	{
		int dup = num;
		int pow = (num+"").length();
		int sum = 0;
		while(num!=0)
		{
			sum+=power((num%10),pow);
			num/=10;
		}
		if(sum==dup)
			return true;
		return false;
	}

	public static int power(int num, int pow)
	{
		int prod = 1;
		for(int i = 1; i<=pow; i++)
		{
			prod *= num;
		}
		return prod;
	}
}