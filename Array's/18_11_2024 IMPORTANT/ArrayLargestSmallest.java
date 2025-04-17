import java.util.*;
class ArrayLargestSmallest
{
	public static void main(String[] args) 
	{
		int [] arr = {10,27,120,11,556,70,76,76,90};
		System.out.println("Smallest Element : "+smallesElement(arr));
		System.out.println("Largest Element : "+largestElement(arr));
		System.out.println("Second Smallest Element : "+secondSmallest(arr));
		System.out.println("Second Largest Element : "+secondLargest(arr));
	}

	public static int secondLargest(int [] arr)
	{
		int large1 = largestElement(arr);
		int large = Integer.MIN_VALUE;//-2147483648

		for(int i:arr)
		{	
			if(large1>i && large<i)
				large = i;
		}
		return large;
	}

	public static int secondSmallest(int [] arr)
	{
		int small1 = smallesElement(arr);
		int small = Integer.MAX_VALUE;//2147483647

		for(int i:arr)
		{	
			if(small1<i && small>i)
				small = i;
		}
		return small;
	}

	public static int smallesElement(int [] arr)
	{
		int small = Integer.MAX_VALUE;//2147483647

		for(int i:arr)
		{
			if(i<small)
				small = i;
		}
		return small;
	}


	public static int largestElement(int [] arr)
	{
		int large = Integer.MIN_VALUE;//-2147483648

		for(int i:arr)
		{
			if(i>large)
				large = i;
		}
		return large;
	}
}