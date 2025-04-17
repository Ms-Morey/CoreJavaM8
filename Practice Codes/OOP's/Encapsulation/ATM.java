import java.util.Scanner ;
class ATM
{
	private long accountNumber ;
	private int pin ;
	private String name ; 
	private String bankName ;
	private String srNo ;
	static Scanner sc = new Scanner(System.in) ;

	ATM(){}

	ATM(long accountNumber , int pin, String name, String bankName , String srNo)
	{
		this.accountNumber = accountNumber ;
		this.pin = pin ;
		this.name = name ;
		this.bankName = bankName ;
		this.srNo = srNo ;
	}

	public long getAccountNumber()
	{
		return accountNumber ;
	}
	public void setPin(int newPin)
	{	
		System.out.print("Enter Current pin : ");
		int pin2 = sc.nextInt();
		System.out.print("Enter the name : ");
		String name2 = sc.nextLine();
		if(name == name2 && pin2 == pin)
		{
			this.pin = newPin ;
		}
		else{
			System.out.println("Wrong Credentials");
		}	
	}

	public String getName()
	{
		return name ;
	}
	public String getBankName()
	{
		return bankName ;
	}
	public String getSrNo()
	{
		return srNo ;
	}
	
}