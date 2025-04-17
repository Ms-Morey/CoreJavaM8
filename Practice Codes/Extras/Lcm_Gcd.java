// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Lcm_Gcd{
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,4,6,7,8,9,10};
        // System.out.println(Arrays.toString(arr));
        // System.out.println(lcmOfArray(arr));
        System.out.println(gcdOfArray(arr));
    }
    
    private static int gcdOfArray(int [] arr)
    {
        int gcd =arr[0];
        for(int i =1; i<arr.length; i++)
            gcd = gcd(gcd,arr[i]);
        return gcd;
    }
    
    private static int gcd(int a , int b)
    {
        int min = Math.min(a,b);
        int gcd =-1;
        for(int i = 1; i<=min; i++)
            if(a%i==0 && b%i==0)
                gcd = i;
        return gcd;
    }
    private static int lcmOfArray(int [] arr)
    {
        int lcm =arr[0];
        for(int i=1; i<arr.length; i++)
            lcm = lcm(lcm,arr[i]);
        return lcm;
    }
    private static int lcm(int a, int b)
    {
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        for(int i =max; ; i+=max)
            if(i%min==0)
                return i;
    }
}