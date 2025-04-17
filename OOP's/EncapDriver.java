class UserAccount
{
	private String username ; //get()  set()
	private int pin ; // get()   set()
	private double bal ; // get()  set()
	private long adhar ; //get()


	UserAccount(String username, int pin, double bal, long adhar)
	{
		super();
		this.username = username ;
		this.pin = pin ;
		this.bal = bal ; 
		this.adhar = adhar ;
	}

	public String getUsername()
	{
		//validation
		return username ;
	}

	public void setUsername(String newUsername)
	{
		username = newUsername ;
	}

	public String getUsername()
	{
		//validation
		return username ;
	}

	public void setPin(int newPin)
	{
		pin = newPin;
	}

	public int getpin()
	{
		//validation
		return pin ;
	}

	public void setUsername(String newUsername)
	{
		username = newUsername ;
	}



}
class EncapDriver
{
	public static void main(String [] args)
	{
		UserAccount obj = new UserAccount("Ramesh",1234,200000,123456789) ;

		System.out.println(obj.getUsername());
		obj.setUsername("Mahesh");

		System.out.println(obj.getUsername());
	}
}