import java.util.*;
class NeonNumber 
{

    public static void main(String[] args) 
    {
      System.out.println(isNeonNumber(9));
    }
    
    private static boolean isNeonNumber(int num)
    {
        int square = num*num;
        int sum = 0;
        while(square!=0)
        {
            sum+=(square%10);
            square/=10;
        }
        if(sum==num)
            return true;
        return false;
    }
    
    
}