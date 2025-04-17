class IncreExample21
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = --a;
		System.out.println(++a + --b + b++ + --b );
		System.out.println(a+b);
		System.out.println(a-- + a);


		int a = 2;
		int b = ++a;
		int c = ++b;
		System.out.println(a++ + ++a + ++b + b + ++c);


		int a = 1;
		int b = ++a;
		int c = a++;
		System.out.printl(++a + b + a + ++c);


		int a = 1;
		int b = ++a;
		int c = a++;
		System.out.println(++b + b + a + ++c);
		System.out.println(a++ + a ++a);
	}
}