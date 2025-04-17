import java.util.Arrays;
class PrintingSingleDimensionArrays
{
	public static void main(String[] args) 
	{

		int [] arr = {10,20,30,40,50,60,70,80};

// Case 1 : Printing using for loop
		for(int i =0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("_________________________");

// Case 2 : Printing using while loop
		int i = 0;
		while(i<arr.length)
		{
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println();
		System.out.println("_________________________");

// Case 3 : Printing using do while loop
		int j = 0;
		do{
			System.out.print(arr[j]+" ");
			j++;
		}
		while(j<arr.length);

		System.out.println();
		System.out.println("_________________________");

//case 4 : Printing array using for each LOOP
		for(int k :arr)		
			System.out.print(k+" ");
		System.out.println();
		System.out.println("_________________________");
//case 5 : Printing Arrays using toString() of Arrays class
		System.out.println(Arrays.toString(arr));
	}
}