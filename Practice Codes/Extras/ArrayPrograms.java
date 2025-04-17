import java.util.*;
class ArrayPrograms
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// System.out.print("Enter length of an Array : ");
		// int len = sc.nextInt();
		// int [] arr = userInputArray(len);

		int [] arr = {1,2,3,4,5};

		int [] rotated = clockWise(arr, 2);

		System.out.println(Arrays.toString(rotated));
		// antiClockWise(arr, rotations);

	}


	private static int [] clockWise(int [] arr, int rot)
	{
		for(int i = 0; i<rot; i++)
		{
			int temp = arr[0];
			for(int j =1; j<arr.length; j++)
			{
				arr[j-1] = arr[j];
			}
			arr[arr.length-1] = temp;
		}
		return arr;
	}
	private static int [] userInputArray(int len)
	{
		int [] arr = new int[len];
		for(int i = 0;i<len; i++)
		{
			System.out.print("Enter element : ");
			int ele = sc.nextInt();
			arr[i] = ele;
		}
		return arr;
	}
	private static void arrayFrequency(int [] arr)
    {
        boolean [] brr = new boolean[arr.length];
        
	    for(int i =0; i<arr.length; i++)
	    {   
	    	int count =0;
	        for( int j=i; j<arr.length; j++)
	        {
	            if(arr[i]==arr[j] && brr[j]==false)
	            {
	                count++;
	                brr[j]=true;
	            }
	        }

	        System.out.println(arr[i]+" : "+count);
	    }
    }
}