import java.util.*;
//ganya
class Example7
{
	static int res[];
	public static void main(String[] args) 
	{
		// char [] arr = {'a','b','c','d','e'};

		// char [] arr2 = {'a','c','e'};

		int [] arr = {1,2,3,4,5,3,4,5,6,7};
		int [] arr2 = {1,2,7,4};
		int count = arr.length;
		System.out.println(count);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr[i]==arr2[j] || isDublicate(i,arr[i],arr))
				{
					arr[i]=0;
					count--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		res = new int[count];
		count=0;
		for( int ele : arr)
		{
			if(ele !=0 && !isExistInResultSet(ele))
			{	
				res[count++] = ele;
			}
		}
		System.out.println(Arrays.toString(res));
	}

	public static boolean isDublicate(int index,int val,int[] arr)
	{
		for(int i=0;i<arr.length;i++){
			if( arr[i]!=0 && arr[i]==val && i!=index){
				return true;
			}
		}
		return false;
	}

	public static boolean isExistInResultSet(int ele)
	{
		for(int i=0;i<res.length;i++)
		{
			if(ele==res[i])
				return true;
		}
		return false;
	}
}