// class Demo1
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hello");
// 		try{
// 			System.out.println("try");
// 			System.out.println(10/0);
// 		}
// 		catch(ArithmeticException ae)
// 		{
// 			System.out.println("catch 1");
// 			System.out.println(10/0);
// 		}
// 		catch(Exception e)
// 		{
// 			System.out.println("catch 2");
// 		}
// 		System.out.println("bye");
// 	}
// }

// class Demo2
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hello");
// 		try{
// 			System.out.println("try");
// 			System.out.println(args[1]);
// 		}
// 		catch(RuntimeException re)
// 		{
// 			System.out.println("catch 1");
// 			System.out.println(10/0);
// 		}
// 		catch(IndexOutOfBoundsException e)
// 		{
// 			System.out.println("catch 2");
// 		}
// 		System.out.println("bye");
// 	}
// }


// import java.io.*;
// class Demo3
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hello");
// 		try{
// 			System.out.println("try");
// 			FileReader file = new FileReader("abc.txt");
// 		}
// 		catch(RuntimeException re)
// 		{
// 			System.out.println("catch 1");
// 			System.out.println(10/0);
// 		}
// 		catch(IOException e)
// 		{
// 			System.out.println("catch 2");
// 		}
// 		catch(Exception e)
// 		{
// 			System.out.println("catch 3");
// 		}
// 		System.out.println("bye");
// 	}
// }

// class Demo4
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hello");
// 		try{
// 			System.out.println("outer try");
// 			try{
// 				System.out.println("inner try");
// 				System.out.println(10/0);
// 			}
// 			catch(ArrayIndexOutOfBoundsException ie)
// 			{
// 				System.out.println("inner catch");
// 			}
// 		}
// 		catch(RuntimeException re)
// 		{
// 			System.out.println("catch 1");
// 			System.out.println(10/0);
// 		}
// 		System.out.println("bye");
// 	}
// }

// class Demo5
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hello");
// 		try{
// 			System.out.println(" outer try");
// 			System.out.println(10/0);
// 			try{
// 				System.out.println("inner try");
// 				System.out.println(10/0);
// 			}
// 			catch(Exception e)
// 			{
// 				System.out.println("inner catch");
// 			}
// 		}
// 		catch(RuntimeException re)
// 		{
// 			System.out.println("outer catch");
// 		}
// 		System.out.println("bye");
// 	}
// }

// class Demo6
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hello");
// 		try{
// 			System.out.println(" outer try");
// 			try{
// 				System.out.println("inner try");
// 				System.out.println(10/0);
// 			}
// 			catch(ArithmeticException ae)
// 			{
// 				System.out.println("inner catch");
// 				String a = null;
// 				System.out.println(a.isEmpty());
// 			}
// 		}
// 		catch(NullPointerException npe)
// 		{
// 			System.out.println("outer catch");
// 		}
// 		System.out.println("bye");
// 	}
// }


// class Demo7
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hello");
// 		try{
// 			System.out.println("outer try");
// 			System.out.println(10/0);
// 		}
// 		catch(ArithmeticException ae)
// 		{
// 			System.out.println("outer catch");
// 			try{
// 				System.out.println("inner try");
// 				System.out.println(10/0);
// 			}
// 			catch(NullPointerException npe)
// 			{
// 				System.out.println("inner catch");
// 			}
// 		}
// 		catch(RuntimeException re)
// 		{
// 			System.out.println("outer catch 2");
// 		}
// 		System.out.println("bye");
// 	}
// }
