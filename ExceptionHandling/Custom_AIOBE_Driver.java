import java.util.Scanner;
class CustomArrayIndexOutOfBoundsException extends RuntimeException
{
	CustomArrayIndexOutOfBoundsException()
	{
		super("Array's length is exceded");
	}

	CustomArrayIndexOutOfBoundsException(String desc)
	{
		super(desc);
	}
}
class Custom_AIOBE_Driver
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the index of arry to fetch the data : ");
		int i = sc.nextInt();

		if(i>arr.length-1)
		{
			throw new CustomArrayIndexOutOfBoundsException("Entered Index Exceeds the arrays length");
		}
		else
		{
			System.out.println(arr[i]);
		}
	}
}