import java.util.*;

class Program82
{
	public static void main(String[] args) 
	{
		int [] arr = {16,17,4,3,5,2};
		findLeader(arr);
	}

	public static void findLeader(int [] arr)
	{	int index = 0;
		int max = 0;
		 
		 findMax(arr,0);bv
	}
	public static void findMax(int[] arr, int index){
		int max=0;
		int foundAt=0;
		for(int i=index;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
				foundAt=i;
			}
		}
		if(max!=0){
		System.out.println(max);
		findMax(arr,foundAt+1);
		}
	}
}