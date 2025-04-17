import java.util.*;
class SecondMax
{
	public static void main(String[] args) 
	{
		int [] arr = {10,23,88,30,38,90,89,89,89,80,13,90,78,39,62,90,100};
		// int [] arr ={20,20,20,20,20};

		bubleSort(arr);
		//Sorting array in DESS is Must
		if(secondMaxeElement(arr)!=0)
			System.out.println(secondMaxeElement(arr));
		else
			System.out.println("Arrays has only single value element");
	}

	public static int secondMaxeElement(int [] arr)
	{
		int a =0;
		if(arr[0]!=arr[1])
			return arr[1];
		else
			for(int i=1; i<arr.length-1; i++)
				if(arr[i]!=arr[i+1])
				{
					 a = arr[i+1];
					 break;
				}				
		return a;
	}

	public static int [] bubleSort(int [] arr)
	{
		for(int i =0; i<arr.length; i++)
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