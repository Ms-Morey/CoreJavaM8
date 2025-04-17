//WAJP to find out the duck numbers of a particular range
import java.util.Scanner;
class RangeOfDuckNumber
{
	public static void main(String[] args) 
	{
		rangeOfDuckNumbers(1,1000);
	}

	public static void rangeOfDuckNumbers(int start, int end)
	{	
		while(start<=end)
		{
			String str = " "+start;
			if(isDuck(str))
				System.out.println(str);
			start++;
		}
	}

	public static  boolean isDuck(String num)
	{
		if(num.charAt(0)=='0')
			return false;
		for(int i =0; i<num.length(); i++)
			if(num.charAt(i)=='0')
				return true;

		return false;
	}
}