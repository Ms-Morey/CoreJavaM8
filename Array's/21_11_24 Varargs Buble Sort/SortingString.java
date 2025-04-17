import java.util.*;
class SortingString
{
	public static void main(String[] args) 
	{
		String [] arr = {"A","B","D","E","C","F"};

		String [] arr2 = {"Sidhesh", "Mahesh", "Kartik","Ganesh","Sanket"};

		System.out.println(Arrays.toString(arr));
		bubleSort(arr);
		bubleSort(arr2);

	}

	public static void bubleSort(String [] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			for (int j = i+1;j<arr.length ;j++ ) 
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}