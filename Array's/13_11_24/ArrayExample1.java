import java.util.*;
class ArrayExample1
{
// Example1
	// public static void main(String[] args) 
	// {
	// 	int [] arr = {10,20,30,40,50,60,70,80};
	// 	for(int i = 0; i<arr.length; i++)
	// 	{
	// 		System.out.println(arr[i]);
	// 	}
	// }


// Example2
	// public static void main(String[] args) 
	// {
	// 	int [] arr = {10,20,30,40,50,60,70,80};
	// 	int len =0;
	// 	for (int i :arr )
	// 	len++;

	// 	System.out.println(len);
	// }

//Example3
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50,60,70,80};
		int len =0;
		for(int i =0; ;i++)
		{
			try{
				System.out.print(arr[i]);
				len++;
			}
			catch(ArrayIndexOutOfBoundsException AIOOB)
			{
				break;
			}
		}
		System.out.println("length of arrray is :"+len);
	}
}

