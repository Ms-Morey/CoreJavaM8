import java.util.*;
class ArrayDuplicateElements
{
	public static void main(String[] args) 
	{
		int [] arr = {1,3,2,4,5,3,5,3};

		arrayDuplicateEle(arr);
	}

	public static void arrayDuplicateEle(int [] arr)
	{
		
		boolean [] barr = new boolean[arr.length];

		for(int i = 0; i<arr.length; i++)
		{
			int count = 0;
			for(int j = 0; j<arr.length; j++)
			{
				if(arr[i]==arr[j] && barr[j] == false)
				{
					count++;
					barr[j]=true;
				}
				// System.out.print(arr[j]+":"+count+" ");
			}
			if(count <=1)
				{
					System.out.println(arr[i]+":"+count);
				}
		}
	}
}