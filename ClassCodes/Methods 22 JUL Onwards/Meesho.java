import java.util.*;
class Meesho
{
	static Scanner sc = new Scanner(System.in);
	static String name;
	static long contactNumber;
	static String address;

	static ArrayList<String> products = new ArrayList<>();

	public static void main(String[] args) 
	{
	    System.out.println("** WELCOME TO MEESHO **");
	    System.out.println();
	    userRegistration();

	}

	public static void userRegistration()
	{
		System.out.println("* Registration Module *");
		System.out.print("Enter your Name:");
		name = sc.nextLine();
		System.out.print("Contact Number:");
		contactNumber = sc.nextLong();
		System.out.print("Address : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.println("Account Created Successfully");
		System.out.println();
		login();

	}
	public static void login()
	{
		categories:
		for(; ;)
		{
			System.out.println("* HOME PAGE *");
			System.out.println();
			System.out.println("1.Electronics 2.Clothes 3.Footwear 4.Checkout 5.Logout");
			System.out.println("Enter an option : ");
			int option = sc.nextInt();
			switch(option)
			{
			    case 1: electronics();break;
			    case 2: clothes();break;
			    case 3: footwear();break;
			    case 4: checkout();break;
			    case 5: System.out.println("VISIT AGAIN");
			    	System.exit(0);break;
			    default: System.out.println("Wrong Input");break;
			}
		}
	}
		public static void checkout()
		{
			double bill = 0;
			for(String product : products)
			{
				String [] arr = product.split(" ");
				bill += Double.parseDouble(arr[1]);
			}
			payment(bill);
		}

		public static void payment(double bill)
		{
			System.out.println("NAME : "+name);
			System.out.println("CONTACT : "+contactNumber);
			System.out.println("ADDRESS : "+address);
			System.out.println("PRODUCT PURCHASED");
			System.out.println(products);
			System.out.println("Bill amount : "+ bill);
			System.out.println("Thank you for Using Our Application ");
			System.out.println("HAVE A NICE DAY");
			System.exit(0);

		}

		public static void electronics()
		{
			System.out.println();
			System.out.println("* ELECTRONICS SECTION *");
			System.out.println("1.Mobile 2.Laptop 3.Smart Watch 4.HomePage");

			for(; ;)
			{
			    System.out.print("Enter an option : ");
			    int option = sc.nextInt();
			    switch(option)
			    {
			    case 1:cart("Mobile: 10000");break;
			    case 2:cart("Laptop: 40000");break;
			    case 3:cart("SmartWatch: 20000");break;
			    case 4: return;
			    default:System.out.println("Wrong Option");
			    }
			}

		}

		public static void clothes()
		{
			System.out.println();
			System.out.println("* CLOTHING SECTION *");
			System.out.println("1.Shirt 2.Jeans 3.Tshirt 4.Homepage");

			for(; ;)
			{
				System.out.print("Enter an option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 1:cart("Shirt: 1000");break;
				case 2:cart("Jeans: 1500");break;
				case 3:cart("Tshirt: 300");break;
				case 4: return;
				default:System.out.println("Wrong Option");
				}
			}
		}

		public static void footwear()
		{
			System.out.println();
			System.out.println("* FOOTWEAR SECTION *");
			System.out.println("1.Shoes 2.Crocs 3.Homepage");

			for(; ;)
			{
				System.out.print("Enter an option : ");
				int option = sc.nextInt();
				switch(option)
				{
				    case 1:cart("Shoes: 3000");break;
				    case 2:cart("Crocs: 1000");break;
				    case 3: return;
				    default:System.out.println("Wrong Option");
				}
			}
		}

        
        public static void cart(String product)
        {
        	products.add(product);
        	System.out.println(product+ " has added inside cart");
        	System.out.println();
        }
	

}