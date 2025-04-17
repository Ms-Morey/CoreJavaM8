// WAJP to print A to Z with numbers/order.
class AlphabatesSequence
{
	public static void main(String[] args) 
	{
		int count=0;
		for(char i='A'; i<='Z'; i++)
		{
			System.out.println(i+"-"+(++count));
		}
	}
}