import java.util.Scanner;
class Restaurent
{
	static double totalBill = 0;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		menuLoop :
		for (; ; ) 
		{
			System.out.println(" * WELCOME TO DURVANKUR*** ");
			System.out.println();
			System.out.println(" ** MENU **");
			System.out.println("1. Veg");
			System.out.println("2. Non-veg");
			System.out.println("3. Order Completed");
			System.out.print("Enter an option : ");
			int option = sc.nextInt();

			switch(option)
			{
				case 1 : vegMenu();
						 break;

				case 2 : nonvegMenu();
						 break;
						 
				case 3 : break menuLoop;

				default : System.out.println("WRONG OPTION !!"); 
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Do you want to add a tip (yes/no) : ");
		if((sc.next()).equals("yes"))
		{
			System.out.print("Enter a tip : ");
			totalBill = totalBill + sc.nextDouble();
		}
		System.out.println("Total bill : "+totalBill+" rs.");
		System.out.println("Thank you visit again...");
	}

	public static void vegMenu()
	{
		System.out.println();
		System.out.println("* VEG MENU *");
		System.out.println("1. Pav Bhaji (121)");
		System.out.println("2. Paneer Tikka (122)");
		System.out.println("3. Veg Biryani (123)");

		order();
	}

	public static void nonvegMenu()
	{
		System.out.println();
		System.out.println("* NON-VEG MENU***");
		System.out.println("1. Mutton Biryani (124)");
		System.out.println("2. Butter Chicken (125)");
		System.out.println("3. Prawns Biryani (126)");

		order();
	}

	public static void order()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("for exit use 0");

		orderLoop :
		for (; ; ) 
		{
			System.out.print("orderId : ");
			int orderId = sc.nextInt();

			switch(orderId)
			{
				case 121 : totalBill += 120; break;
				case 122 : totalBill += 260; break;
				case 123 : totalBill += 220; break;
				case 124 : totalBill += 320; break;
				case 125 : totalBill += 400; break;
				case 126 : totalBill += 520; break;
				case 0 : break orderLoop;
				default : System.out.println("WRONG ORDER ID"); break;
			}	
		}
		System.out.println(totalBill);
	}
}