import java.util.*;
class Printing3DArray
{
	public static void main(String[] args) 
	{
		int [][][] arr = {{{1,2,3},{4,5,6},{21,23,45}},{{7,8,9},{10,11,12},{23,4,54}}};

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[0][0].length);
		System.out.println(arr[0][1].length);
		

		// for(int i = 0; i<arr[i].length;i++)
		// {
		// 	for(int j = 0; j<arr[i][j].length; j++)
		// 	{
		// 		for(int k = 0; k<arr[i][j].length; k++)
		// 		{
		// 			System.out.println(arr[i][j][k]);
		// 		}
		// 	}
		// }

		// int [] arr1 = {1,2,3,4,5};
		// for(int i =0; i<arr.length; i++)
		// {
		// 	System.out.println(arr[i]);
		// }
	}
}