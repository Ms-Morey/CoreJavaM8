//144 2197 196 3375 256 4913 324 6859 400 9261
class NumSeries
{
	public static void main(String[] args) 
	{
		int a = 12;
		int pro = 0;
		int count =1;
		while(count <= 10)
		{
			if (count%2==0) 
			{
				pro = a*a*a;
				
			}else{
				pro = a * a;
			}

			System.out.print(pro + " ");
			count++;
			a++;
			
		}
		
	}
}