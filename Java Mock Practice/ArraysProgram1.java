//WAJP to find out the no. of servers required to handle the load;

import java.util.*;
class ArraysProgram1
{
    public static void main(String[] args) 
    {
        int [] serverLoadCap = {1, 2, 3, 5};
        int load = 11;
        System.out.println(noOfServersRequired(serverLoadCap, load));
    }
    
    //it's Raw login need to be verified , go to chat gpt to check if has issues 
    private static int noOfServersRequired(int[] serverCap, int load)
    {  

    	Arrays.sort(serverCap);
        int count = 0;
        int sum =0;
        for(int i= serverCap.length-1; i>=0; i--)
        {
            sum+=serverCap[i];
            count++;
            if(sum == load)
                return count;
                
            else if(sum>load)
            {
                sum-=serverCap[i];
                count--;
            }
        }
        return -1;
    }
}