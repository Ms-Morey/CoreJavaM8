

public  class LongestPalindromicSubString 
{
	
	
	// private static void isPalindromeUsingPointers(String str)
	// {
	// 	char prev = 0;
	// 	char curr = 0;
	// 	char next = 0;
	// 	int max = 0;
	// 	for(int i = 0; i<str.length(); i++)
	// 	{
	// 		int count = 0;
	// 		prev = str.charAt(i);
	// 		curr = str.charAt(i);
	// 		next = str.charAt(i);
	// 		int indx1 = i;
	// 		int indx2 = i;
	// 		// System.out.println("prev : "+prev + " curr : "+curr+" next : "+next);
	// 		while(prev==next)
	// 		{
		
	// 			try {
	// 				prev = str.charAt(--indx1);
	// 				next = str.charAt(++indx2);	
	// 				// System.out.print("prev : "+prev + " curr  : "+curr + " next : "+next+"\n");
	// 			} 
	// 			catch (StringIndexOutOfBoundsException e) {
	// 					break;
	// 			}
	// 			count++;
	// 			// System.out.println(prev);
	// 			// System.out.println(count);
	// 		}
	// 		if(count+1>max)
	// 		{
	// 			max = count+1;
	// 		}
	// 	}

	// 	System.out.println();

	// 	System.out.println(max);	
	// }
}
