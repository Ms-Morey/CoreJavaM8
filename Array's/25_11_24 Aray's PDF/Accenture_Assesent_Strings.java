import java.util.*;
class Accenture_Assesent_Strings
{
	public static void main(String[] args) 
	{
		String [] arr = {"hello", "java", "word", "table"};
		System.out.println(removeVowels("mahesh"));
	}

	public static String removeVowels(String str)
	{
		String str1 = "";
		for(int i = 0;i<str.length(); i++)
		{
			System.out.println(str.charAt(i));
		
			str1=str+str.charAt(i);
		}
		return str1;
	}



	public static int factorials(int num)
	{
		int fact = 1;
		for(int i = 1; i<=num; i++)
			fact*=i;
		return fact;
	}
}