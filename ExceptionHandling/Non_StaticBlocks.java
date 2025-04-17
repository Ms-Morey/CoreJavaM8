// class Non_StaticBlocks
// {
// 	{
// 		System.out.println("Non-static Block 1");
// 	}

// 	{
// 		System.out.println("Non-static Block 2");
// 	}

// 	public static void main(String[] args) 
// 	{
// 		System.out.println("main");
// 		Non_StaticBlocks obj = new Non_StaticBlocks();
// 	}

// 	{
// 		System.out.println("Non-static Block 3");
// 	}
// }

// class Example23
// {
// 	{
// 		System.out.println("Non-static block example23");
// 	}

// 	public static void main(String[] args) 
// 	{
// 		System.out.println("main");	
// 		Example23 obj = new Example23();
// 		Example24 obj2 = new Example24();
// 	}
// }
// class Example24
// {
// 	static{
// 		System.out.println("static block");
// 	}

// 	{
// 		System.out.println("non-static block example24");
// 	}
// }