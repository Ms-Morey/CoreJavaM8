class Main
{
	public static void main(String[] args) 
	{
		// int const = 10;
		// System.out.println(const);

		// const int m = 10;
		// System.out.println(m);

		gcd(20,30);
	}

	private static void lcm(int num2, int num2)
	{

	}

    
    public static int gcd(int a, int b)
    {
        // first checking which number is small like which simply means we must iterate for small number only.
        // a =20 & b =30 so we can say than the greatest common divisor cannot be greater than 20.
        int i;
        if(a<b)
        i=a;
        else
        i=b;
        
        int gcd =1;
        for(int j =1; j<=i; j++)
        {
            if(a%j==0 && b%j ==0)
            {
               gcd=j;
            }
        }
    
        return gcd;
    }
}
