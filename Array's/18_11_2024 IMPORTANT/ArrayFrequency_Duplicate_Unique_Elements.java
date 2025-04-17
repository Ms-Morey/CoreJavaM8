import java.util.*;
class ArrayFrequency_Duplicate_Unique_Elements
{
	public static void main(String[] args) 
	{
		int [] arr ={5,3,2,1,3,4,2,2,4,7};
		int len = arr.length;
		boolean [] barr = new boolean[len];

		for(int i = 0; i<len; i++)
		{
			int iele = arr[i];
			int icount = 0;

			for(int j = 0; j<len; j++)
			{
				int jele = arr[j];

				if(iele == jele && barr[i]==false)
				{
					icount++;
					barr[j] = true;
				}
			}
			// For Frequency
			if(icount !=0)
					System.out.println(iele+" : "+icount);

			// For Unique elements 
			if(icount ==1)
				System.out.println(iele+":"+icount);

			// For Duplicate Elements 
			if(icount >1)
				System.out.println(iele+":"+icount);
		}
	}
}