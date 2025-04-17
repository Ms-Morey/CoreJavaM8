import java.util.*;
class ForEachExample
{
	public static void main(String[] args) 
	{
		String [] str = {"Ramesh","Suresh","Mahesh","Kamlesh"};
		for(String name : str)
			System.out.println(name);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);

		for(Integer i : list)
		{
			System.out.print(i+" ");
		}
	}
}