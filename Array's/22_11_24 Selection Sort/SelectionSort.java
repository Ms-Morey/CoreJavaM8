import java.util.Arrays;
//Sorting a String Array Using Selection Sort in Descending Order
class SelectionSort
{
	public static void main(String[] args) 
	{
			String [] arr = {"MAHESH","SIDDESH","SAKSHI","SANKET", "ADITYA", "GANESH","KARTIK"};
			selectionSortOfString(arr);
	}	

	public static void selectionSortOfString(String [] arr)
	{
		for(int i =0; i<arr.length; i++)
		{
			int index = i;
			for(int j = i+1; j<arr.length; j++)
			{
				if((arr[i].compareTo(arr[j]))<0)
					index = j;
			}

			String temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}