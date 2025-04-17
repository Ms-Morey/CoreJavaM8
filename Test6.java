//WAJP to print odd no from 125 to 938
class Test6
{
	public static void main(String[] args) 
	{
		
		int  a=125;
		while(a<=938)
		{
			if(a%2!=0)
			{
				System.out.print(a+" ");	
			}
			a++;
		}
	}
}