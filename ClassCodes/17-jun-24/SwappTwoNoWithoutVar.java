class SwappTwoNoWithoutVar
		{
			public static void main(String[] args)
			{
				int a = 2;
				int b = 3;
				System.out.println("Variables before swapping");
				System.out.println("a->"+a);
				System.out.println("b->"+b);
				  
				a = a+b;
				b = a-b;
				a = a-b;  
				    
				System.out.println("Variables After swapping");
				System.out.println("a->"+a);
				System.out.println("b->"+b);
			}
		}