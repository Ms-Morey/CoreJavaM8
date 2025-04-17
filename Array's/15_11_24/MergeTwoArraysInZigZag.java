import java.util.*;
class MergeTwoArraysInZigZag
{
	// public static void main(String[] args) 
	// {
	// 	int [] a = {10,20,30,40,50};
	// 	int [] b = {60,70,80,90,100};
	// 	int [] c = new int[a.length+b.length];


	// 	for(int i = 0,bi = 0; i<a.length; i++)
	// 	{
	// 			c[bi++] = a[i];
			
	// 			c[bi++] = b[i];
	// 	}
	// 	System.out.println(Arrays.toString(c));
	// }


// Merging 2 arrays of variable length
	public static void main(String[] args) 
	{
		int [] a = {10,20,30,40,50};
		int [] b = {60,70,80};

		int [] c = new int[a.length+b.length];
				
		for(int i = 0,ci = 0; i<a.length; i++)
		{
				c[ci++]=a[i];
				if(i<b.length)
					c[ci++] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}
}