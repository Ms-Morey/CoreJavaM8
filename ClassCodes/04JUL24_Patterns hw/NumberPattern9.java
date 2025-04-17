/*WAJP to print the following pattern


*/

class NumberPattern9
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			int num =4;
			System.out.print(i);
			for(int j=1;j<=i; j++)
			{	
				System.out.print(j+num+" ");
				num--;
				
			}
			System.out.println();
		}
	}
}