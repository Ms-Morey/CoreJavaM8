import java.util.*;
class PracticeExample
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8};
		bubleSort(arr);
	}

	public static void bubleSort(int [] arr)
	{
		int count1 = 0;
		boolean swap = false;
		for(int i = 0; i<arr.length; i++)
		{
			count1++;
			for(int j = 1; j<arr.length-i; j++)
			{
				if(arr[j]<arr[j-1])
				{
					swap = true;
					int temp = arr[j];
					arr[j]	= arr[j-1];
					arr[j-1] = temp;
				}
			}
			if(!(swap))
			{
				System.out.println("Array is already sorted");
				break;
			}
		}
		System.out.println("Outer Loop : "+count1);
		System.out.println(Arrays.toString(arr));
	}
}