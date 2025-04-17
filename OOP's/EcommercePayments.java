import java.util.Scanner ;
class Payment{
	//username
	//accountnumber
	//phone Number
	// ifscode

	public void modeOfPayment(Payment obj) //upcasting
	{
		if(obj instanceof GooglePay)
		{
			GooglePay obj1 = (GooglePay)obj; //downcasting
			System.out.println(obj1.str);
		}
		else if(obj instanceof PhonePay)
		{
			PhonePay obj1 = (PhonePay)obj;
			System.out.println(obj1.str);
		}
		else
		{
			Paytm obj1 = (Paytm)obj;
			System.out.println(obj1.str);
		}
	}
}

class GooglePay extends Payment
{
	String str = "Hello From Google Pay";
}

class PhonePay extends Payment
{
	String str = "Hello From Phone Pay";
}

class Paytm extends Payment
{
	String str = "Hello from Pytm";
}


class EcommercePayments
{
	public static void main(String[] args) 
	{
		System.out.println("Payment Options");
		System.out.println("1. GooglePay");
		System.out.println("2. PhonePay");
		System.out.println("3. Paytm");
		System.out.println("4. COD");

		System.out.print("Enter your option : ");
		int opt = new Scanner(System.in).nextInt();

		switch(opt)
		{
			case 1:
				{
					GooglePay obj = new GooglePay();
					obj.modeOfPayment(obj);
					break ;
				}
			case 2:
				{
					PhonePay obj = new PhonePay();
					obj.modeOfPayment(obj);
					break ;
				}
			case 3:
				{
					Paytm obj = new Paytm();
					obj.modeOfPayment(obj);
					break ;
				}
			case 4: System.out.println("Cash On Delivery"); break;
			default:System.out.println("Wrong Input Option");
		}
	}
}