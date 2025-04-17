import java.util.*;
class addExample3
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Collection coll = new HashSet();
		coll.add(10);
		coll.add(20);
		System.out.println(coll);

		Collection coll1 = new ArrayList();
		coll1.add(10);
		coll1.add(20);
		System.out.println(coll1);

		Collection coll2 = new TreeSet();
		coll2.add(10);
		coll2.add(20);
		System.out.println(coll2);

		Collection coll3 = new ArrayList();
		coll3.add("fifty");
		coll3.add(20);
		coll3.add("sixty");
		System.out.println(coll3);

		System.out.println(coll.addAll(coll1));
		System.out.println(coll);
	}
}