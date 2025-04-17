class OtpGernerator
{
	public static void main(String[] args) 
	{
		int otp = 0;
		for(int i =1; i<=6; i++)
		{
			otp= (otp*10)+(int)(Math.random()*10);
		}
		System.out.println(otp);
	}
}