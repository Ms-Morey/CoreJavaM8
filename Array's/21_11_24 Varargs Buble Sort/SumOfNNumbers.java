class SumOfNNumbers
{
	public static void main(String[] args) 
	{
		int op1 = add(10,20);
		int op2 = add(10,20,30);
		int op3 = add(10,20,30,40);
		int op4 = add(10,20,30,40,50);

		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		System.out.println(op4);
	}


	public static int add(int ... a)
	{
		int sum = 0;
		for(int i:a)
			sum+=i;
		return sum;
	}
}