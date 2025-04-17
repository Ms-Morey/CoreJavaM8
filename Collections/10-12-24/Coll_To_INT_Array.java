import java.util.*;
class Coll_To_INT_Array
{
	// @SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Collection<Integer>coll = new ArrayList<>();
		for(int i = 10; i<=40; i+=10)
		{
			coll.add(i);
		}
		System.out.println(coll);

		Object [] arr = coll.toArray();
		System.out.println(Arrays.toString(arr));

		int [] arr1 = new int[arr.length];
		for (int i = 0; i<arr.length; i++) 
		{
			arr1[i] = (Integer)arr[i];
		}

		System.out.println(Arrays.toString(arr1));
	}
}