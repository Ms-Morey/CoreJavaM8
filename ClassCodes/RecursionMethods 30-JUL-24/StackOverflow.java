//20528 Stack capacity
class StackOverflow
{
	static int count = 0;
	public static void main(String[] args) 
	{
		stackCapacity();
	}
	public static void stackCapacity()
	{
		count++;
		if(count>100)
		return;
		System.out.println(count);
		stackCapacity();
	}
}