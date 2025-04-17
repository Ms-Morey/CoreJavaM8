import java.util.*;
class Col
{
	public static void main(String[] args) 
	{
		Collection coll = new ArrayList();
		coll.add(10);
		coll.add("20");
		coll.add(30);
		coll.add("40");
		coll.add(true);
		coll.add(50);
		coll.add('S');
		coll.add("Hello");
		coll.add(10.0);

		// System.out.println(coll);
		System.out.println(coll.remove("20"));
		// System.out.println(coll);

		Collection coll1 = new ArrayList();
		for ( Object ele : coll ) 
		{
			if((ele instanceof Integer))
			coll1.add(ele);
		}
		System.out.println(coll1);
	}
}