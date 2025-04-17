import java.util.*;
class SmallestElement
{
	public static void main(String[] args) 
	{
		int [] arr = new int[10];

		for(int i = 0,index=0; i<10; i++)
		{
			int num = (int)(Math.random()*1000);
			if(num>100)
				arr[index++]=num;
			else
				i--;
		}
		System.out.println(Arrays.toString(arr));

		int smallest = Integer.MAX_VALUE;
		for(int ele : arr)
		{
			if(smallest>ele)
				smallest=ele;
		}
		System.out.println(smallest);
	}
}