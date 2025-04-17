public final class UserString 
{
	char [] arr; // null
	
	public UserString()
	{
		arr = new char[0];
	}
	
	public UserString(String str)
	{
		arr = new char[str.length()];
		for(int i =0; i<str.length();i++)
			arr[i] = str.charAt(i);
	}

	public UserString(StringBuffer str)
	{
		if (str == null) 
	    {
	        throw new NullPointerException("Input byte array cannot be null");
	    }
		arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
        	arr[i] = str.charAt(i);
	}

	// public UserString(StringBuilder str)
	// {
	// 	if (str == null) 
	//     {
	//         throw new NullPointerException("Input byte array cannot be null");
	//     }
	// 	arr = new char[str.length()];
	// 	for(int i=0; i<str.length(); i++)
	// 		arr[i] = str.charAt(i);
	// }

	// public UserString(char[] charArray) 
	// {
 //        if (charArray == null) 
 //        {
 //            throw new NullPointerException("Input char array cannot be null");
 //        }
 //        arr = charArray.clone(); // Clone the array to ensure encapsulation
 //    }

 //     public UserString(byte[] byteArray) 
 //     {
 //        if (byteArray == null) 
 //        {
 //            throw new NullPointerException("Input byte array cannot be null");
 //        }
 //        arr = new char[byteArray.length];
 //        for (int i = 0; i < byteArray.length; i++)
 //        {
 //            arr[i] = (char)byteArray[i]; 
 //        }
 //    }
	


	// NOt MIne
	// public UserString(char[] charArray, int from, int noElements) 
	// {
	//     if (charArray == null) 
	//     {
	//         throw new NullPointerException("Input char array cannot be null");
	//     }
	//     if (from < 0 || from + noElements > charArray.length || noElements < 0) 
	//     {
	//         throw new ArrayIndexOutOfBoundsException("Invalid range: from=" + from + ", noElements=" + noElements);
	//     }
	// 	    arr = new char[noElements];
	// 	    arr = charArray.clone(); // Clone the array and use the range
	// 	    arr = java.util.Arrays.copyOfRange(arr, from, from + noElements); 
	// }


	// Not mine 
	// public UserString(byte[] byteArray, int from, int noElements) 
	// {
	//     if (byteArray == null) 
	//     {
	//         throw new NullPointerException("Input byte array cannot be null");
	//     }
	//     if (from < 0 || from + noElements > byteArray.length || noElements < 0) 
	//     {
	//         throw new ArrayIndexOutOfBoundsException("Invalid range: from=" + from + ", noElements=" + noElements);
	//     }
	// 	    byte[] temp = byteArray.clone(); // Clone the byte array
	// 	    byte[] subset = java.util.Arrays.copyOfRange(temp, from, from + noElements);
	// 	    arr = new char[noElements];
	// 	    for (int i = 0; i < noElements; i++) {
	//        		arr[i] = (char) subset[i]; // Convert each byte to char
	//     }
	// }

	@Override
	public String toString()
	{
		String str = "";
		for(char ch : arr)
			str+=ch;
		return str;
	}

	public int length()
	{
		return arr.length;
	}
	
	public boolean isEmpty()
	{
		if(arr.length == 0)
			return true;
		else
			return false;
	}
	public char charAt(int indx)
	{
		if(indx<0 || indx>=arr.length)
			throw new StringIndexOutOfBoundsException("Wrong INDEX :"+ indx);
		return arr[indx];
	}
	
	public int codePointAt(int indx)
	{
		if(indx<0 || indx>=arr.length)
			throw new StringIndexOutOfBoundsException("Wrong INDEX : "+indx);
		return arr[indx]+0;
	}
	
	public int codePintBefore(int indx)
	{
		if(indx<1 || indx>arr.length)
			throw new StringIndexOutOfBoundsException("Wrong INDEX : "+(indx-1));
		return arr[indx-1]+0;
	}
	
	public int codePointCount(int start, int end)
	{
		if(start<0 || end>=arr.length || start>end)
			throw new IndexOutOfBoundsException("Range ["+start+","+end+"] out of bounds");
		return end-start;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		String str1 = (String)obj;
		UserString str2 = new UserString(str1);
		
		if(this.length()!= str2.length())
			return false;
		int indx =0;
		for(char ch : arr)
		{
			if(ch == str2.charAt(indx++))
				continue;
			else
				return false;
		}
		return true;
	}

	public String toUpperCase()
	{
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - ('a' - 'A'));
            }
        }
   		return toString();
	}

	public String toLowerCase()
	{
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] - ('A' - 'a'));
            }
        }
    	return toString();
	}

	
	public boolean startsWith(String str)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i])
		}
	}
}

class StringDriver
{
	public static void main(String[] args) 
	{
		UserString str1 = new UserString("ABCD");
		System.out.println(str1.toLowerCase());
	}
}
