import java.util.*;
class ArrayRotations
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5};
		
		clockWise(arr);
		antiClockWise(arr);
	}

	public static void clockWise(int [] arr)
	{
		int rotation = 2;

		for(int i=1; i<=rotation; i++)
		{
			int temp = arr[0];
			for(int j = 1; j<arr.length; j++)
			{
				arr[j-1]=arr[j];
			}
			arr[arr.length-1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

			// int [] arr = {1,2,3,4,5};
	public static void antiClockWise(int [] arr)
	{
		int rotation = 2;
		for(int i =1; i<=rotation; i++)
		{
			int temp = arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[0]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}