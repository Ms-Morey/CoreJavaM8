import java.util.Scanner;
class CustomStringIndexOutOfBoundsException extends RuntimeException
{
	CustomStringIndexOutOfBoundsException()
	{
		super("StringIndexOutOfBounds custom Exception");
	}
	CustomStringIndexOutOfBoundsException(String desc)
	{
		super(desc);
	}
}
class StringIOOBE_ExampleDriver
{
	public static void main(String[] args)
	{
		// System.out.println(args.length);
		Scanner sc = new Scanner(System.in);
		String str = "Hello";
		System.out.print("Enter the index to fetch the character : ");
		int index = sc.nextInt();
		if(index > str.length()-1)
		{
			throw new CustomStringIndexOutOfBoundsException();
		}
		else
		{
			System.out.println(str.charAt(index));
		}
	}
}