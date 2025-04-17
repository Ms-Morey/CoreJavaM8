import java.util.*;
class StringToCharArray
{
	public static void main(String[] args) 
	{
			String str = "Hello";
			System.out.println(Arrays.toString(stringToArray(str)));
	}

	public static String[] stringToArray(String str)	
	{
		String [] arr = new String[str.length()];
		for(int i = 0; i<str.length(); i++)
			arr[i] = ""+str.charAt(i);
		return arr;
	}
}