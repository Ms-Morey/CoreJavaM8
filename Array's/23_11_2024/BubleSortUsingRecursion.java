import java.util.*;
class BubleSortUsingRecursion
{
	static int i = 0;
	public static void main(String[] args) 
	{
		int [] arr = {3,5,2,1,4}; 
	bubleSort(arr);
	System.out.println(Arrays.toString(arr));
	}

	public static void bubleSort(int [] arr)
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

		i++;
		if(i==arr.length)
			return;
		bubleSort(arr);
	}
}