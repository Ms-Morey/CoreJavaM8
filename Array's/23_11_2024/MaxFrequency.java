import java.util.*;
class MaxFrequency
{
	public static void main(String[] args) 
	{
			String [] arr = {"pen","bottle","marker","pen","bottel","duster"};
			maxFrequency(arr);
	}

	public static void maxFrequency(String [] arr)	
	{
		boolean [] b = new boolean [arr.length];
		int max = 0;
		String ele = "";

		for(int i = 0; i<arr.length; i++)
		{
			int cnt = 0;
			for(int j = 0; j<arr.length; j++)
			{
				if((arr[i]).equals(arr[j]) && b[j]==false)
				{
					cnt++;
					b[j] = true;
				}

			}
			if(cnt!=0)
			{
				if(max<cnt)
					ele=arr[i];
			}
		}
		System.out.println("Highest element is "+ele+" with "+max+" count");
	}
	
}