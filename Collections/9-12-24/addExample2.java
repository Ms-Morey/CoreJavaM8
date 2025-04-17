import java.util.*;
class addExample2
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Collection coll = new TreeSet();

		// System.out.println(coll.add(3));
		// System.out.println(coll.add(4));
		// System.out.println(coll.add(1));
		// System.out.println(coll.add(2));
		// System.out.println(coll.add(2));
		// System.out.println(coll.add("4"));
		// System.out.println(coll);


		Collection coll1 = new HashSet();

		System.out.println(coll1);
		System.out.println(coll1.add(10));
		System.out.println(coll1.add(20));
		System.out.println(coll1.add(30));
		System.out.println(coll1.add(20));
		System.out.println(coll1.add("20"));
		System.out.println(coll1);
	}
}