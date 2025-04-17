class Parent
{
	 void m1()
	{
		System.out.println("m1() Parent");
	}
}
class Child extends Parent
{
	public void m2()
	{
		System.out.println("m1() Child");
	}
}
class Inheritance
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.m1();
	}
}