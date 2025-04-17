//WAJP to find count of numbers in a range , where the number cannot have a repeating digit in it
class ArraysProgram2
{
	public static void main(String[] args) 
    {
       System.out.println(countOfNumbersWithUniqueDigits(1,19));
    }
    
    private static int countOfNumbersWithUniqueDigits(int start, int end)
    {
        int count=0;
        for(int i =start; i<=end ; i++)
        {
            if(hasRepeatingDigits(i))
                continue;
            count++;
        }
        return count;
    }
    private static boolean hasRepeatingDigits(int num)
    {
    	//a array of boolean with all false values
        boolean [] brr = new boolean[10];
        while(num>0)
        {
            int digit = num%10;

            //condition to check if digit repeated ?
            if(brr[digit]) 
                return true;
            
            //if digit not repeated , then make the brr[digit] true
            brr[digit] = true;

            
            num/=10;
        }
        return false;  
    }
}