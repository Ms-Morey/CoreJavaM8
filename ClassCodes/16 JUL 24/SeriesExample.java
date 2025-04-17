// WAJP to find the 10 nubmers of a given series , 144,2197,196,3375,256
class SeriesExample
{
	public static void main(String[] args) 
	{	
		int square =1;
		int cube =1;
		for(int i =12; i<=21; i++)	
		{
			if(i%2==0)
			{
				square = i*i;
				System.out.println(square+" ");
			}
			else
			{
				cube = i*i*i;
				System.out.println(cube+" ");
			}
		}
	}
}