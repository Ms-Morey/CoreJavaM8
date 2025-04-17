import java.util.Scanner;
class SwitchExample1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Vote For Change ***");
		System.out.println("1.BJP");
		System.out.println("2.AAP");
		System.out.println("3.NCP");
		System.out.println("4.ShivSena");
		System.out.println("5.MNS");
		System.out.println("6.INCP");
		System.out.println("7.NOTA");
		System.out.println();
		System.out.print("Enter an option to vote : ");
		int option = sc.nextInt();

		switch(option)
		{
		case 1:System.out.println("You have voted for BJP");break;
		case 2:System.out.println("You have voted for AAP");break;
		case 3:System.out.println("You have voted for NCP");break;
		case 4:System.out.println("You have voted for ShivSena");break;
		case 5:System.out.println("You have voted for MNS");break;
		case 6:System.out.println("You have voted for INCP");break;
		case 7:System.out.println("You have voted for NOTA");break;
		default :System.out.println("You have wasted your vote.");break;
		}

	}

}