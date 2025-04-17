import java.util.*;
class ArrayPalindromeElements
{
	public static void main(String[] args) 
	{
		String [] arr = {"Mahesh","Nitin","Ganesh","Bob","Kartik","Raqib"};
		printPalindrome(arr);
		// System.out.println(isPalindrome("Nitin"));
	}

	public static void printPalindrome(String [] str)
	{
		for(String i :str)
		{
			// System.out.println(isPalindrome(i));
			if(isPalindrome(i))
				System.out.println(i);
		}
	}

	public static boolean isPalindrome(String str)
	{
		String str1 = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			// System.out.println(str.charAt(i));
			str1 += str.charAt(i);
		}
			if(str.toLowerCase().equals(str1.toLowerCase()))
				return true;
			return false;
	}
}