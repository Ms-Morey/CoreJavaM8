import java.util.*;
class SecondLargestElement
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
		int largest = Integer.MIN_VALUE;
		int sLargest = largest;
		for(int ele : arr)
		{
			if(largest<ele)
				largest=ele;
		}
		System.out.println(largest);
	}
}