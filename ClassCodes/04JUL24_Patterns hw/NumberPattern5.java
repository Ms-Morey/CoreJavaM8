/*WAJP to print the following pattern
1
1 0
1 0 1
1 0 1 0
*/
class NumberPattern5
{
	public static void main(String[] args) 
	{
		for(int i =1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j%2!=0)
				{
					System.out.print(1+" ");
				}
				else{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}
}