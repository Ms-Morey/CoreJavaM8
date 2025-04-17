import java.util.*;
class FascinationNumber 
{
    public static void main(String[] args) 
    {
       System.out.println(fascinatingNumber(192));
    }
    
    private static boolean fascinatingNumber(int num)
    {   
        // A number must be atleast 3 digits
        if(num<100)
            return false;

        String numStr = (num*1)+""+(num*2)+""+(num*3);

        //A number must not contain 0 or must be of length of 9
        if(numStr.contains("0") || (numStr.length()!=9))
                return false;

        //converting the String to a char Array for checking
        char [] arr = numStr.toCharArray();
        //sorting array in ascending
        Arrays.sort(arr);

        // Converting a char Array to String using String class Constructor
        String str = new String(arr);

        if(str.equals("123456789"))
            return true;
        return false;
    }
    
    
}