/*
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/
class InvertedPyramid
{
	public static void main(String[] args) 
	{
		for(int i=5; i>=1; i--)
		{
			//space
			for(int j=5; j>i; j--)
			{
				System.out.print("  ");
			}
			//half star pyramid
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			//remaining half star pyramid
			for(int l=2; l<=i; l++)
			{
				System.out.print("* ");
			}
			//moves cursor to next line
			System.out.println();
		}
	}
}