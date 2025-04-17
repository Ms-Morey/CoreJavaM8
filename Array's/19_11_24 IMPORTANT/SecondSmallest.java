import java.util.*;
class SecondSmallest
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,13,13,14,13,15,13,45,56,13,40,50,20,20,40,30,70};
		
		frequencyOfElement(arr,secondSmallest(arr));

	}

	public static int secondSmallest(int [] arr)
	{
		int min1 = Integer.MAX_VALUE; //100
		int min2 = Integer.MAX_VALUE; //100
		
		for(int i : arr)
		{
			if(min1>i)
			{
				min2 = min1;
				min1 = i;
			}
			else if(min2>i && min1<i)
			{
				min2=i;
			}
		}
		return min2;
	}

	public static void frequencyOfElement(int [] arr, int ele)
	{
		boolean [] brr = new boolean[arr.length];

		for(int i = 0; i<arr.length; i++)
		{
			int count =0;
			for(int j = 0; j<arr.length; j++)
			{
				if(arr[i]==arr[j] && brr[j]==false && arr[i]==ele)
				{
					count++;
					brr[j] = true;
				}
			}
			if(arr[i] == ele && count>1)
				System.out.println("Frequency of "+ele+ " is "+count);
		}
	}
}