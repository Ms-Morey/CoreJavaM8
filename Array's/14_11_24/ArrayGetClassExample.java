class ArrayGetClassExample
{
	public static void main(String[] args) 
	{
		byte [] a = new byte [1];
		short [] b = new short [1];
		int [] c = new int [1];
		long [] d = new long [1];
		float [] e = new float [1];
		double [] f = new double [1];
		char [] g = new char [1];
		boolean [] h = new boolean [1];
		String [] i = new String [1];
		ArrayGetClassExample [] j = new ArrayGetClassExample[1];

		System.out.println(a.getClass());
		System.out.println(b.getClass());
		System.out.println(c.getClass());
		System.out.println(d.getClass());
		System.out.println(e.getClass());
		System.out.println(f.getClass());
		System.out.println(g.getClass());
		System.out.println(h.getClass());
		System.out.println(i.getClass());
		System.out.println(j.getClass());



	}
}