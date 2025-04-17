import java.util.*;
class AccentureProblem2
{

	public static void main(String[] args) 
	{
		int [] arr = {5,5,2,2,1,4,4,3,1,4,4};
		boolean [] b = new boolean[arr.length];
		
		int sL = secondLargest(arr);
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(sL==arr[i] && arr[i]==arr[j] && b[j]==false)
				{
					count++;
					b[j]=true;
				}
			}
		}
		System.out.println(sL+":"+count);
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