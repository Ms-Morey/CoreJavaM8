import java.util.*;
class RecursiveBubbleSort 
{
	public static void main(String[] args) 
	{
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSort(arr, arr.length);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    
    static void bubbleSort(int[] arr, int len) 
    {	
    	if(len == 1)
    		return;

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        len--;
        bubbleSort(arr,len);
    }
}
