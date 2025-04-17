class Sunny_TechNumber
{
    public static void main(String[] args) 
    {
        System.out.println(TechNumberM2(2025));
    }


    //Tech Number only using number operations;
    private static boolean TechNumber(int num)
    {
        String str = num+"";
        if((str.length())%2!=0)
            return false;
        int divisor = (int)Math.pow(10,(str.length()/2));
        int firstHalf = num/divisor;
        int secondHalf = num%divisor;
        
        return ((firstHalf+secondHalf)*(firstHalf+secondHalf)==num);
        
    }

    // TechNumber using Strings
    private static boolean TechNumberM2(int num)
    {
        String str = Integer.toString(num);
        if((str.length())%2!=0)
            return false;
        int mid = str.length()/2;
        int firstHalf = Integer.parseInt(str.substring(0,mid));
        int secondHalf = Integer.parseInt(str.substring(mid));
        
        return ((firstHalf+secondHalf)*(firstHalf+secondHalf)==num);
    }

    private static boolean sunnyNumber(int num)
    {   
        int dup = num+1;
        for(int i=1; i<=num/2; i++)
            if((i*i)==dup)
                return true;
        return false;
    }
}

