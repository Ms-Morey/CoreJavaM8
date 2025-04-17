class IncreExample1
{
	public static void main(String[] args) 
	{
	/*	int a = 5; //5
		int b = a++;//a=5 (6), b =5
		int c =a; //a = 6, c = 6
						// 6	 5	   6	6	7	 6	 6 =42
		System.out.println(a++ + b++ + c + c++ + a + b + b++);
		*/

		/*int a = 2; //2
		int b = a;//b-2
		int c =b++; //c = 2 b=2(3)
						// 2 	 3 	 2 		3    3     4  3 = 20
		System.out.println(a++ + b + c++ + b++ + a++ + a+ c);
		*/

		/*int a = 1; //1
		int b = a++;//b-1, a-1(2)
		int c =a++; //c-2, a-2(3)
						// 3	 1 	   2 	4 2 3 = 15
		System.out.println(a++ + b++ + c++ +a+b+c);
		*/

		/*int a = 3; // a-3
		int b = a++;//b-3, a-3(4)
		int c =b++; // c =3 , b-3(4)
				// 		   4 4 3 = 11
		System.out.println(a+b+c);
		*/
		
		int a = 2; // a-2
		int b = a++;//b-2, a-2(3)
		int c =a; // c =3 , a-3
				// 		    3    2    3 =8
		//System.out.println(a++ + b++ +c++);
		
						// 	  3  2
		// System.out.println(a + b);
			//				3    2     4 3 = 12
		// System.out.println(a++ + b++ + a+b);
				//    	   	3   4   4      5 = 18
		// System.out.println(a++ + a + a++ + a++);
		        //            3   3    4 = 10
		// System.out.println(a + a++ +a);

				//			  3   3
		// System.out.println(a + a++);

		int coin = 5;
		System.out.println(coin++); //5(6)
		System.out.println(coin++); // 6(7)
		System.out.println(coin);  //7
		System.out.println(coin++);//7(8)
		 


	}
}