class Positive_Negative_Array
{
	public static void main(String[] args) 
	{
		int [] arr = {-1,-34,-55,12,-3,-45,10,11,12,14};
		int poslen = 0;
		int neglen = 0;
		for(int ele:arr)
		{
			if(ele>0)
				poslen++;
			else
				neglen++;
		}
		int [] posArr = new int[poslen];
		int [] negArr  = new int[neglen];

		for(int i = 0,posi = 0,negi = 0; i<arr.length; i++)
		{
			if(arr[i]>0)
				posArr[posi++] = arr[i];
			else
				negArr[negi++] = arr[i];
		}

		for (int i :posArr ) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i :negArr ) 
		{
			System.out.print(i+" ");
		}
	}

	// public static void main(String[] args) 
	// {
	// 	int [] arr = {-1,-2,-3,5,6,3,5,6};
	// 	int poslen = 0;
	// 	int neglen = 0;

	// 	for (int i : arr ) 
	// 	{
	// 		if(i>0)
	// 			poslen++;
	// 		else
	// 			neglen++;
	// 	}

	// 	int [] posArr = new int[poslen];
	// 	int [] negArr = new int[neglen];
		
	// }
}