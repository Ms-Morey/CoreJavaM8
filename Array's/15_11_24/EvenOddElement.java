import java.util.*;
class EvenOddElement
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14};
		int elen = 0;
		int olen = 0;
		for(int ele:arr)
		{
			if(ele%2==0)
				elen++;
			else
				olen++;
		}
		int [] evenArr = new int[elen];
		int [] oddArr  = new int[olen];

		for(int i = 0,ei = 0,oi = 0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				evenArr[ei++] = arr[i];
			else
				oddArr[oi++] = arr[i];
		}

		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));
	}
}