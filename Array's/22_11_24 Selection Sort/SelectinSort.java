import java.util.Arrays;
class SelectinSort
{
	public static void main(String[] args) 
	{
		int[] arr = {5, 4, 3, 2, 1};

		selectionSort(arr);

		System.out.println(Arrays.toString(arr));


	}

	static void selectionSort(int[] arr){

		for (int i=0; i < arr.length ; i++ ) {
			
			int last = arr.length - 1 - i;
			int max = findMax(arr, 0, last);

			swapped(arr, last, max);

		}
	}

	static int findMax(int[] arr, int s, int e){
		int max = s;
		for (int i=0; i<=e; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}
	static void swapped(int[] arr, int f, int s){
		int t = arr[f];
		arr[f] = arr[s];
		arr[s] = t;
	}
}