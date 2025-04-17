class OddEvenElements
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14};
		
		for(int i:arr)
		{
			if(i%2==0)
				System.out.println(i+" is even");
			else
				System.out.println(i+" is odd");
		}
		
	}
}