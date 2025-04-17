import java.util.*;
class PrintingOfMultiDimensionalArray
{
	public static void main(String[] args) 
	{
		int [][] arr = {{10,20,30,40},{50,60,70,80}};

//Case 1 : Printing using for loop
		System.out.println("Printing Array Using For");
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++ )
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("========================");
		System.out.println();

//Case 2 : Printing using while loop
		System.out.println("Printing Array Using While");
		int i = 0;
		while(i<arr.length)
		{
			int j =0;
			while(j<arr[i].length)
			{
				System.out.print(arr[i][j]+" ");
				j++;
			}
			i++;
		}
		System.out.println();
		System.out.println("========================");
		System.out.println();

//Case 3 : Printing using do while loop
		System.out.println("Printing Array Using do While");
		int k = 0;
		do{
			int l = 0;
			do{
				System.out.print(arr[k][l]+" ");
				l++;
			}
			while(l<arr[k].length);
			k++;
		}
		while(k<arr.length);
		System.out.println();
		System.out.println("========================");
		System.out.println();

//Case 4 : Printing using foreach loop
		System.out.println("Printing Array Using For Each loop");
		for(int [] m :arr)
		{
			for(int n:m)
			{
				System.out.print(n+" ");
			}
		}
		System.out.println();
		System.out.println("========================");
		System.out.println();

//Case 5 : Printing using deepToString() loop (using Arrays.deepToString())
		System.out.println("Printing Array Using deepToString() method");
		System.out.println(Arrays.deepToString(arr));

	}
}