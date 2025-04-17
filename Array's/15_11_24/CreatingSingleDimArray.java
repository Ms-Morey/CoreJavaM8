import java.util.*;
class CreatingSingleDimArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int [] arr = new int [size];


		// System.out.println(Arrays.toString(arr));

		for(int i = 0; i<size; i++)
		{
			System.out.print("Enter the element for "+i+" index of an array : ");
			int input = sc.nextInt();
			arr[i] = input;
		}
		System.out.println(Arrays.toString(arr));
	}	
}