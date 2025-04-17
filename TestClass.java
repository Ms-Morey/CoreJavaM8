import java.util.Scanner;
class TestClass
{
	public static void main(String[] args)
	{
		int a =3; // a=3
		int b = a++; //a =3(4), b=3
		int c =b;  // c =3
						// 4   3(4)  3   4(5)  4(5)  3   5   5(6) =31
		System.out.println(a + b++ + c + a++ + b++ + c + a + b++);
			}
}