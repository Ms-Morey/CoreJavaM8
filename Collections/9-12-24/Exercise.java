import java.util.*;
class Exercise
{
	public static void main(String[] args) 
	{
		System.out.println(isPalindrome(1234));
	}
	private static boolean isPalindrome(int num)
	{
		String str = Integer.toString(num);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		if(str.equals(sb.toString()))
			return true;
		return false;
	}
	// @SuppressWarnings("unchecked")
	// public static void main(String[] args) 
	// {
	// 	Collection<Integer> coll = new ArrayList<>();

	// 	for(int i = 1; i<=9; i++)
	// 	{
	// 		coll.add(i);
	// 	}
	// 	System.out.println(coll);

	// 	System.out.println(coll.contains(8));

	// 	Collection<Integer> oddColl = new ArrayList<>();

	// 	for(Integer ele : coll)
	// 	{
	// 		if(!(ele%2==0))
	// 		{
	// 			oddColl.add(ele);
	// 		}
	// 	}
	// 	System.out.println(oddColl);
	// 	System.out.println(coll.containAll(oddColl));


	// 	coll.removeAll(oddColl);
	// 	System.out.println(coll);

	// 	coll.clear();
	// 	System.out.println(coll);
	// 	System.out.println(coll.isEmpty());
	// 	System.out.println(oddColl.isEmpty());
	// }
}