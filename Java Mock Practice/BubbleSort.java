import java.util.*;
class BubbleSort
{
	public static void main(String[] args) 
	{
		int [] arr = {1,9,4,5,7,8,3,2};
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	public static int []  bubbleSort(int [] arr)
	{
		for(int i = 0; i<=arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}
}