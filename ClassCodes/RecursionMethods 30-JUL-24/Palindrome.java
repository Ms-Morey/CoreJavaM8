class Palindrome
{
	static int num =123;
	static int dup = num;
	static int rev = 0;
	static int rem = 0;
	public static void main(String[] args) 
	{
		isPalindrome();
	}
	public static void isPalindrome()
	{
		if(num==0)
		{
			if(rev==dup)
			{
				System.out.println(dup+ " is palindrome");
				return;
			}
			System.out.println(dup+" is not a palindrome");
			return;
		}
		rem = num%10;//5
		rev = (rev*10)+rem;
		num/=10;
		isPalindrome();
	}
}