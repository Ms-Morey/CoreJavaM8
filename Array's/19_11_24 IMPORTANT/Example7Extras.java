import java.util.*;
class Example7Extras
{ 
   public static void main(String[] args) 
   {
        int[] arr = {1,2,3,4,3,2,1,2,7};
       System.out.println(Arrays.toString(printUniqueArray(arr)));
    }

    public static int [] printUniqueArray(int [] arr)
    {
    	int [] array = newArray(markingDuplicates(arr),countOfUniqEle(arr));
    	return array;
    }

    public static int[] markingDuplicates(int [] arr)
    {
   		 // Remove duplicates by -1
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    arr[j] = -1; // Mark duplicate elements
                }
            }
        }
        return arr;
    }


    public static int countOfUniqEle(int [] arr)
    {
    	//count of unique ele len of unique arr
        int uniqueCount = 0;
        for (int num : arr) 
        {
            if (num != -1) 
            {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static int [] newArray(int[] arr, int uniqueCount)
    {
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;
        for (int num : arr) 
        {
            if (num != -1) 
            {
                uniqueArray[index++] = num;
            }
        }
        return uniqueArray;
    }
}
