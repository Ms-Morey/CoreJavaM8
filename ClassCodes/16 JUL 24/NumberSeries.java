//WAJP to print the following series next numbers 4,-13,-12,37,-84
class NumberSeriesProgram1
{
	public static void main(String[] args) 
	{
		int num = 3;
		int num1 =4;
		System.out.print(nu1+" ");
		int icnt =0;
		for(int i =1; true; num++)
		{
			int count= 0;

			for(int j=2; j<num; j++)
			{
				if(num%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				icnt++;
				int sqr = num*num;
				if(i++%2!=0)
				{
					int nnum1 = num1+sqr;
					num1 =nnum1;
					System.out.print(nnum1+" ");
				}
			}
		}
		if(icnt==9)
		{
			break;
		}
	}
}