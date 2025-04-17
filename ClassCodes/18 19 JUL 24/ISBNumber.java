//ISBN number it is 10 digits number ISBN = 'Iternation Standard Book Number'
// WAJP to find out the given ISBN number is valid or not , 1259060977
class ISBNumber
{
	public static void main(String[] args) 
	{
		int num = 1259060977;
		int dup = num;
		int add = 0;
		int pos = 1;
		while(num>0)
		{
			add += (num%10)*pos++;
			num/=10;
		}
		if(add%11==0)
		{
			System.out.println(dup+" it is a valid ISBN number");
		}
		else
		{
			System.out.println("Not a valid ISBN number");
		}
	}
	
}