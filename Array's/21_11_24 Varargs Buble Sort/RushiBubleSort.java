import java.util.*;
class RushiBubleSort
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5};
		
		System.out.println("Arrays in Ascending Order");
		acesndingOrder(arr);
		System.out.println("Arrays in Descending Order");
		descendingOrder(arr);
	}

	public static void acesndingOrder(int [] arr)
	{
		int count =0;
		boolean swap;
		for(int i =0; i<arr.length; i++)
		 {	//swap = false;
			for(int j = 1; j<arr.length-i; j++)
			{
				if(arr[j]<arr[j-1])
				{
					// swap=true;
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					count++;
				}
			}
			if(!swap)
			{
				System.out.println();
				break;
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
	}
}