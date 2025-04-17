/*WAJP to print the following pattern 
1
3 2
6 5 4
10 9 8 7
15 14 13 12 11
*/
class NumberPattern8
{
	public static void main(String[] args) 
	{
		int a=0;

		for(int i=1; i<=5; i++)
		{
			a+=i;		
			for(int j=a; j>a-i; j--)
			{	
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}