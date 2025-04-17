//WAJP to convert 2D array into 1D array
import java.util.*;
class Convert_2D_Into_1D
{
	public static void main(String[] args) 
	{
		
		int [][] arr2D = {{10,20,30,40},{50,60,70,80,90}};

		int [] arr1D= new int[arr2D[0].length+arr2D[1].length];

		int index = 0;
		for (int i=0; i<arr2D.length;i++) 
		{
			for(int j=0; j<arr2D[i].length; j++)
			{
				// System.out.println(arr2D[i][j]);
				arr1D[index++] = arr2D[i][j];
			}
		}
		for (int k :arr1D )
		{
			System.out.println(k);
		}
	}
}