public class SpecialStringReversing
{
    

    public static void main(String[] args) 
    {
        System.out.println(reverseSpeciaString("he@ll#o"));
        // System.out.println(isAlphabet('n'));
    }
    
    private static String reverseSpeciaString(String str)
    {
        char [] crr = str.toCharArray();
        System.out.println(Arrays.toString(crr));
        int start =0;
        int len =crr.length;
        int end = crr.length-1;
        for(int i =0; i<len; i++)
        {
            if(start>len/2 || end<len/2)
                break;
            if(isAlphabet(crr[start]) && isAlphabet(crr[end]))
            {
                char temp = crr[start];
                crr[start] = crr[end];
                crr[end] = temp;
                start++;
                end--;
            }
            if(!isAlphabet(crr[start]))
                start++;
            if(!isAlphabet(crr[end]))
                end--;
        }
         System.out.println(Arrays.toString(crr));
         return new String(crr);
    }
    
    private static boolean isAlphabet(char ch)
    {
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            return true;
        return false;
    }
}