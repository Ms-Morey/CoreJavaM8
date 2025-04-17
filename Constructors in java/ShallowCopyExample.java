class Address
{
	String street ;
	String landmark ;
	int pincode ;

	Address(String street, String landmark, int pincode)
	{
		this.street = street ;
		this.landmark = landmark ;
		this.pincode = pincode ;
	}

	void displayAddress()
	{
		System.out.println();
		System.out.println("Address Details ");
		System.out.println("Ptreet name : "+street);
		System.out.println("landmark : "+ landmark);
		System.out.println("Pincode : "+pincode);
	}
}

class User
{
	String username ;
	String password ;
	String address ;

	User(String username , String password , String address)
	{
		this.username = username ;
		this.password = password ;
		this.address = new Address(street, landmark ,pincode) ;
	}

User(User existing)
{
	this.username =existing.username ;
	this.password = existing.password;
	this.address = existing.address ;
}

}






class ShallowCopyExample
{
	public static void main(String[] args) 
	{
		//.existingobj
		User existing = new User("Ramesh", "ramesh123", "JM Road", "Opp to Hp petro", 400000) ;
		existing.displayUser() ;
		existing.address.displayAddress() ;

		System.out.println();
		//copy of an obj .... invoking copy constructor
		User.copy = new User(existing);
		copy.displayUser() ;
		copy.address.desplayAddress() ;
	}
}