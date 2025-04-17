class Fibo
{
	public static void main(String[] args) 
	{
		int firstTerm =0;
		int secondTerm =1;

		//logic//
		for(int i =1; i<=30; i++)
		{
			System.out.print(firstTerm+" ");

			int nextTerm =firstTerm+secondTerm;//c=a+b
			firstTerm = secondTerm; //a=b;
			secondTerm=nextTerm; //b=c;

		}
	}
}