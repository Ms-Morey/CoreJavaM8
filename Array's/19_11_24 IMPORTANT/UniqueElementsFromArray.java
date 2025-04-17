import java.util.*;
class UniqueElementsFromArray
{
	public static void main(String[] args) 
	{
		char [] arr1 = {'A','B','C','A','B','D'};
		char [] arr2 = {'A','B'};

		removeCommonElements(arr1,arr2);
	}


	public static void removeCommonElements(char[]arr1, char[] arr2)
	{
		for(int i = 0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
					arr1[i]=0;
			}
		}
		
		for(char i:arr1)
			if(i!=0)
				System.out.println(i);
	}
}