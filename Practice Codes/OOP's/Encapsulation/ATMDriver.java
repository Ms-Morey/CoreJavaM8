class ATMDriver
{
	public static void main(String[] args) 
	{
		ATM a1 = new ATM(1234537849, 4433,"Mahesh Mory","SBI","32C2J") ;
		System.out.println(a1.getAccountNumber()) ;
		a1.setPin(2345) ;
		
	}
}