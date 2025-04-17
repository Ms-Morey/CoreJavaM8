import java.util.Arrays;
class Google
{
	String username;
	String pass;
	String dob;
	String emailID;
	long contact;
	String gender;

	Google(String username, String pass, String dob, String emailID, long contact, String gender)
	{
		super();
		this.username = username;
		this.pass = pass;
		this.dob = dob;
		this.emailID = emailID;
		this.contact = contact;
		this.gender = gender;
	}

	public void dispalyGoogle()
	{
		System.out.println();
		System.out.println("Your Google Details");
		System.out.println("Username :"+ this.username);
		System.out.println("Password :"+ this.pass);
		System.out.println("Date of Birth :"+ this.dob);
		System.out.println("Email ID :"+ this.emailID);
		System.out.println("Contact Number :"+ this.contact);
		System.out.println("Gender :"+ this.gender);
	}
}

class GooglePay extends Google
{
	String name;
	long accountNumber;
    String ifscCode;
    int upiPIN;
    long debitCard;

    GooglePay(String name, long accountNumber, String ifscCode, int upiPIN, long debitCard,
              String username, String pass, String dob, String emailID, long contact, String gender)
    {
    	super(username, pass, dob, emailID, contact, gender);
    	this.name = name;
    	this.accountNumber = accountNumber;
    	this.ifscCode = ifscCode;
    	this.upiPIN = upiPIN;
    	this.debitCard = debitCard;
    }

    public void displayGooglePay()
    {
    	System.out.println();
    	System.out.println("Your Google Pay Details");
    	System.out.println("Name :"+ this.name);
    	System.out.println("Acc Number :"+ this.accountNumber);
    	System.out.println("IFSC :"+ this.ifscCode);
    	System.out.println("UPI PIN :"+ this.upiPIN);
    	System.out.println("Debit Card Number :"+ this.debitCard);
    }
}

class GoogleMaps extends Google
{
	String currentLoc;
	String [] bookmarks;
	String modeTravel;

	GoogleMaps(String currentLoc, String [] bookmarks, String modeTravel,
               String username, String pass, String dob, String emailID, long contact, String gender)
	{
		super(username, pass, dob, emailID, contact, gender);
		this.currentLoc = currentLoc;
		this.bookmarks = bookmarks;
		this.modeTravel = modeTravel;
	}

	public void GoogleMaps()
	{
		System.out.println();
		System.out.println("Your Google Maps Details");
		System.out.println("Current Loc :"+ this.currentLoc);
		System.out.println("Bookmarks :"+ Arrays.toString(this.bookmarks));

		System.out.println("Mode of Travel :"+ this.modeTravel);
	}
}


class GoogleMeet extends Google 
{
	String hostName;
	String joiningLink;
	String schedule;
	String meetID;

	GoogleMeet(String hostName, String joiningLink, String schedule, String meetID,
              String username, String pass, String dob, String emailID, long contact, String gender)
	{
		super(username, pass, dob, emailID, contact, gender);
		this.hostName = hostName;
		this.joiningLink = joiningLink;
		this.schedule = schedule;
		this.meetID = meetID;
	}
}

class GoogleClassroom extends Google
{
	String className;
	String subject;
	String teacherName;
	String classID;

	GoogleClassroom(String className, String subject, String teacherName, String classID,
                   String username, String pass, String dob, String emailID, long contact, String gender)
	{
		super(username, pass, dob, emailID, contact, gender);
		this.className = className;
		this.subject = subject;
		this.teacherName = teacherName;
		this.classID = classID;
	}

	public void displayGoogleClassroom()
	{
		System.out.println();
		System.out.println("Your Google ClassRoom Details");
		System.out.println("ClassName :"+ this.className);
		System.out.println("Subject Name :"+ this.subject);
		System.out.println("Teacher Name :"+ this.teacherName);
		System.out.println("ClassRoom Id :"+ this.classID);
	}
}


class HierarchicalDriverExample
{
	public static void main(String[] args) 
	{
		GooglePay obj = new GooglePay("Siddhesh kuhrade", 1450333512718l, "HDFC1335", 696969, 
			225044503836l, "siddesh", "siddeshlikessanika", "16/03/2003", "siddesh@420@gmail.com", 9890835851l, "Male" );
		obj.dispalyGoogle();
		obj.displayGooglePay();
	}
}


