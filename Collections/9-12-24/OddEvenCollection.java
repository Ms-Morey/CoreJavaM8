import java.util.*;
class OddEvenCollection
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Collection<Integer> coll = new ArrayList<>();

		for(int i = 1; i<=9; i++)
		{
			coll.add(i);
		}
		System.out.println(coll);

		Collection<Integer> oddColl = new ArrayList<>();

		for(Integer ele : coll)
		{
			if(!(ele%2==0))
			{
				oddColl.add(ele);
			}
		}
		System.out.println(oddColl);

		coll.removeAll(oddColl);
		System.out.println(coll);

		coll.clear();
		System.out.println(coll);
		System.out.println(coll.isEmpty());
		System.out.println(oddColl.isEmpty());
	}
}