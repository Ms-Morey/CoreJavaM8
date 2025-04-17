class Recursions
{
	public static void main(String[] args) 
    {
        // System.out.println(isPrime(11,2));
      printNumbersInRange(1,100);
        // System.out.println(isEven(599));
    }
   private static void printNumbersInRange(int start, int end)
   {
        if(start>end)
            return;
        if(isPrime(start,2)) 
            System.out.println(start);
        // System.out.println(start++); //To print the numbers only
        start++;
        printNumbersInRange(start,end);
   }
   
   private static boolean isEven(int num)
   {
       return (num%2==0);
   }
   
   private static boolean isPrime(int num, int divisor)
   {
       if(num<2)
           return false;
       if(num%divisor==0)
           return false;
       if(divisor * divisor > num) // divisor has crossed the num/2 mark. that means after this point a number cannot have any factor.
           return true;
       divisor++;
       return isPrime(num,divisor);
   }
}