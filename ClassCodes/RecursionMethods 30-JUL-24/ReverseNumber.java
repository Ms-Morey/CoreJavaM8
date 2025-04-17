//Reverse Number 
class ReverseNumber
{
	static int num =1221;
	static int rev = 0;
	static int rem = 0;
	public static void main(String[] args) 
	{
		reverse();
		System.out.println(rev);
	}
	public static void reverse()
	{
		if(num==0)
			return;
		rem = num%10;//5
		rev = (rev*10)+rem;
		num/=10;
		reverse();
	}
}