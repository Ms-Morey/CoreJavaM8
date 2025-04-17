//find odd numbers between 1 to 15
class OddNumbers
{
	static int num =0;
	public static void main(String[] args) 
	{
		oddNum();
	}
	public static void oddNum()
	{
		num++;
		if(num>15)
			return;

		if(num%2!=0)
			System.out.println(num);
		oddNum();
		// System.out.println("I am wildcard");
	}
}