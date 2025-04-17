//A number who has three prime factors
class SphenicNumber 
{
    public static void main(String[] args) 
    {
        // System.out.println(sphenicNumber(30));
        // System.out.println(isPrime(2));
        // System.out.println(buzzNumber(28));
        // floyedTriangle(5);
        // coPrimes(8,9);
        // gcd(20,30);
        // isPronicNumber(42);
    }

    private static void inRange(int start, int end)
    {
        for(int i=start; i<=end; i++)
        {
            //just create a boolen method to check the numbers in range for particular number. 
            // eg. isPime
            if(isStrong(i))
                System.out.println(i);
        }
    }


    // Evil number is a number who hava even number of 1's present in it's binary
     private static boolean isEvilNumber(int num)
     {
        //Integer.bitCount() in java returns the count of positive bits, i.e count of 1's in binary form
        int count = Integer.bitCount(num);
        if(count%2==0)
            return true;
        return false;
        // return ((Integer.bitCount(num)%2==0));
     }


    //Pronic Number : multipliction of two consecutive numbers is pronic number 7*8 = 56
    private static boolean isPronicNumber(int num)
    {
        for(int i = 1; i<=num/2; i++)
            if(num==(i*(i+1)))
                return true;
        return false;
    }

    private static boolean sphenicNumber(int num)
    {   int count =0;
        for(int i =2; i<=num/2; i++)
            if(num%i==0 && isPrime(i))
            {
                count++;
                System.out.println(i);
            }
        if(count==3)
            return true;
        return false;
    }

    private static boolean isPrime(int num)
    {   
        if(num<2)
            return false;
        for(int i =2; i<=num/2; i++)
            if(num%i==0)
                return false;
        return true;
    }

    //A buzz number is a number which is either divisible by 7 or has 7 as last digit
     private static boolean buzzNumber(int num)
    {   
        String str = num+"";
        if(num%7==0 || str.charAt(str.length()-1)=='7' )
            return true;
        return false;
    }


    //Co-Primes or not
    // co-primes are the numbers who has only 1 as a common factor 
     private static boolean coPrimes(int a, int b)
    {
        return (gcd(a,b)==1);
        // if(gcd(a,b)==1)
        //     return true;
        // return false;
    }
    private static int gcd(int a, int b)
    {
       int max = Math.max(a,b);
       int min = Math.min(a,b);
       int gcd =1;
       for(int i=1; i<=min; i++)
            if(max%i==0 && min%i==0)
                gcd =i;
        return gcd;
    }


    //Floyed's Triangle
    private static void floyedTriangle(int row)
    {
       int num = 1;
       for(int i =1; i<=row; i++)
       {
           for(int j =1; j<=i; j++)
           {
               System.out.print(num+" ");
               num++;
           }
           System.out.println();
       }
    }


    //Harshad Number is a number which is divisible by it's sum of digits
    private static boolean isHarshadNumber(int num)
    {
        return (num%(sumOfDigits(num))==0);
        // if(num%(sumOfDigits(num))==0)
        //     return true;
        // return false;
    }

    private static int sumOfDigits(int num)
    {
        int sum = 0;
        while(num!=0)
        {
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }


     //Strong Number : sum of factorial of it's digit is equal to the numberis a strong number
    private static boolean isStrong(int num)
    {   int dup = num;
        int sum =0;
        while(num!=0)
        {
            sum+=(factorial(num%10));
            num/=10;
        }
        
        return (sum==dup);
    }

    // Method to find factorial
    private static int factorial(int num)
    {
        int fact =1;
        for(int i =num; i>=1; i--)
            fact*=i;
        return fact;
    }
    
    //Armstrong number : an Armstrong number is a number that equals the sum of its individual digits, each raised to the power of the number of digits. 153
    private static boolean isArmstrong(int num)
    {   
        int count =count(num);
        int dup = num;
        int sum =0;
        while(num!=0)
        {
            sum+=(power((num%10),count));
            num/=10;
        }
        return (dup==sum);
    }
    //Method to count the digits of a number
    private static int count(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        return count;
    }
    //method to find power of integers , Math.pow will return double that's why
    private static int power(int num, int pow)
    {   
        int power=1;
        for(int i =1; i<=pow; i++)
            power*=num;
        return power;
    }
}