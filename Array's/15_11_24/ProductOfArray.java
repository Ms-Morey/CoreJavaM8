// WAJP to find product of elements of an array
class ProductOfArray
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.print(productOfElements(arr));
		
	}

	public static int productOfElements(int [] arr)
	{
		int prod = 1;
		for (int i : arr ) 
		{
			prod*=i;	
		}
		return prod;
	}
}