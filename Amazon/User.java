class User
{
	private String userName;
	private long contactNumber;
	private String email;
	private String address;
	private String password;
	private Bank bank ; //null

	User(String userName, long contactNumber, String email, String address, String password )
	{
		this.userName = userName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.password = password;
		this.address = address;
		System.out.println();
		System.out.println("Account Created");
	}

	public String getUserName()
	{
		return userName;
	}
	public void setUsername(String newUserName)
	{
		this.userName = newUserName;
	}
	public long getContactNumber()
	{
		return contactNumber;
	}
	public void setContactNumber(long newContactNumber)
	{
		this.contactNumber = newContactNumber;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String newEmail)
	{
		this.email = newEmail;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String newAddress)
	{
		this.address = newAddress;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String newPassword)
	{
		this.password = newPassword;
	}
}