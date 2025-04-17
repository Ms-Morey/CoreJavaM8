// class FinallyExample1
// {
// 	public static void main(String[] args)
// 	{
// 		try{
// 			System.out.println("try");
// 			System.out.println("10/0");
// 		}
// 		catch(ArithmeticException ae)
// 		{
// 			System.out.println("ArithmeticException handled");
// 		}
// 		finally{
// 			System.out.println("finally block");
// 		}
// 	}
// }

// class FinallyExample2
// {
// 	public static void main(String[] args)
// 	{
// 		System.out.println(10/0);
// 		try{
// 			System.out.println("try");
// 			System.out.println("10/0");
// 		}
// 		catch(ArithmeticException ae)
// 		{
// 			System.out.println("ArithmeticException handled");
// 		}
// 		finally{
// 			System.out.println("finally block");
// 		}
// 	}
// }

// class FinallyExample3
// {
// 	public static void main(String[] args)
// 	{
// 		try{
// 			System.out.println("try");
// 			System.out.println("10/0");
// 		}
// 		catch(ArithmeticException ae)
// 		{
// 			System.out.println("ArithmeticException handled");
// 			System.exit(0);
// 		}
// 		finally{
// 			System.out.println("finally block");
// 		}
// 	}
// }

// class FinallyExample4
// {
// 	public static void main(String[] args)
// 	{
// 		try{
// 			System.out.println("try");
// 			System.out.println(10/0);
// 		}
// 		catch(ArithmeticException ae)
// 		{
// 			System.out.println("ArithmeticException handled");
// 			System.exit(0);
// 		}
// 		finally{
// 			System.out.println("finally block");
// 		}
// 	}
// }

// class FinallyExample5
// {
// 	public static void main(String[] args)
// 	{
// 		System.out.println("exe starts");
// 		m1();
// 		System.out.println("exe ends");
// 	}

// 	public static void m1()
// 	{
// 		try{
// 			System.out.println("try");
// 			System.out.println(10/0);
// 		}
// 		catch(ArithmeticException ae)
// 		{
// 			System.out.println("catch block");
// 			return ;
// 		}
// 		finally{
// 			System.out.println("finally block");
// 		}
// 	}	
// }

// class FinallyExample6
// {
// 	public static void main(String[] args)
// 	{
// 		for(int i = 1; i<=5; i++)
// 		{
// 			try{
// 				System.out.println("try block "+i);
// 				if(i==2)
// 					System.out.println(10/0);
// 			}
// 			catch(ArithmeticException ae){
// 				System.out.println("catch block");
// 				break;
// 			}
// 			finally{
// 				System.out.println("finally block");
// 			}
// 		}
// 	}
// }

// class FinallyExample7
// {
// 	public static void main(String[] args)
// 	{
// 		for(int i = 1; i<=5; i++)
// 		{
// 			try{
// 				System.out.println("try block "+i);
// 				if(i==2)
// 					System.out.println(10/0);
// 			}
// 			catch(ArithmeticException ae){
// 				System.out.println("catch block");
// 				break;
// 			}
// 			finally{
// 				System.out.println("finally block");
// 				continue;
// 			}
// 		}
// 	}
// }
