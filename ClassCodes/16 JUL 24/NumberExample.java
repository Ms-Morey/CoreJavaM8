//WAJP to print numbers from 1 to 100 except the numbers divisible by 5 use contunue
class NumberExample
{
	public static void main(String[] args) 
	{
		for(int i =1; i<=100; i++)
		{
			if(i%5==0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}