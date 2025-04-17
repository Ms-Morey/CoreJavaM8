// find even num between 100 to 50.
class EvenNumbers
{
	static int num = 100;
	public static void main(String[] args) 
	{
		evenNum();
	}
	public static void evenNum()
	{
		num--;
		if(num<50)
			return;
		if(num%2==0)
			System.out.println(num);
		evenNum();
	}
}