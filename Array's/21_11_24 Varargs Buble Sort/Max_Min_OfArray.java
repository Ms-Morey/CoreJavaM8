import java.util.*;
class Max_Min_OfArray
{
	public static void main(String[] args) 
	{
		int [] arr = {10,23,88,30,38,80,13,90,78,39,62};

		acesndingOrder(arr);

		int maxOfArray = arr[arr.length-1];
		int minOfArray = arr[0];

		System.out.println("Max of Array is : "+maxOfArray);
		System.out.println("Min of Array is : "+minOfArray);
	}


	public static void acesndingOrder(int [] arr)
	{
		for(int i =0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}


	// public static void descendingOrder(int [] arr)
	// {
	// 	for(int i =0; i<arr.length; i++)
	// 	{
	// 		for(int j = i+1; j<arr.length; j++)
	// 		{
	// 			if(arr[i]<arr[j])
	// 			{
	// 				int temp = arr[i];
	// 				arr[i] = arr[j];
	// 				arr[j] = temp;
	// 			}
	// 		}
	// 	}
	// 	System.out.println(Arrays.toString(arr));
	// }
}