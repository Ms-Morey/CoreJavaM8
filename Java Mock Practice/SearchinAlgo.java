import java.util.*;
class SearchinAlgo
{
    public static void main(String[] args) 
    {
        int [] arr = {2,4,1,3,8,6,5,9,7};
        int num = 8;
        System.out.println(binarySearch(arr,num));
    }
    private static int linearSearch(int [] arr, int num)
    {
        for(int i = 0; i<arr.length; i++)
            if(arr[i]==num)
                return i;
        return -1;
    }
    
    private static int binarySearch(int [] arr, int num)
    {
        Arrays.sort(arr);
        int start = 0;
        int end =arr.length-1;
        
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==num)
                return mid;
            else if(num<arr[mid])
                end = mid-1;
            else if(num>arr[mid])
                start = mid+1;
        }
        return -1;
    }
}