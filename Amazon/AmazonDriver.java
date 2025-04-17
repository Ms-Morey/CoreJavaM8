import java.util.Scanner;
class AmazonDriver
{
	static User user ; //null
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		for( ; ;)
		{
			System.out.println();
			System.out.println("   **** WELCOME TO AMAZON ****");
			System.out.println();
			System.out.println("1. Existing User 2. New Account");
			System.out.println();
			System.out.print("Enter an option : ");
			int option = sc.nextInt();
			switch(option)
			{
				case 1:{
							if(user!=null)
							{
								for(int i = 1; i<=3; i++)
								{
									login();
								}
								System.exit(0);
							}
							else{
									System.out.println("CREATE YOUR ACCOUNT FIRST");
								}
							break;
						}
				case 2 :{
							//

							System.out.println("Enter your details to create account");
							System.out.print("Enter username : ");
							sc.nextLine();
							String userName =sc.nextLine();
							System.out.print("Contact Number : ");
							long contactNumber = sc.nextLong();
							System.out.print("Email : ");
							String email = sc.next();
							System.out.print("Address : ");
							sc.nextLine();
							String address = sc.nextLine();
							System.out.print("Password : ");
							String password = sc.next();

							user = new User(userName, contactNumber, email, address, password);
							break;
						}

			}
		}
	}

	public static void login()
	{
		System.out.println("Login Module ");
		System.out.print("Enter your username : ");
		sc.nextLine();
		String userName1 = sc.nextLine();
		System.out.print("Enter a password :");
		String password1 = sc.next();

		if((user.getUserName().equals(userName1)) && (user.getPassword().equals(password1)))
		{
			HomePage home = new HomePage();
			home.shopByCat();
		}else{
			System.out.println("Wrong Credentials");
		}
	}
}