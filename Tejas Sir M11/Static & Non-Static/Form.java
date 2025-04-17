class Form
 {
 	String name;
 	long phno;
 	String email;
 	String dob;
 	char gender;
 	String loc;
 	String edu;
 	String blood;
 	String maritialStatus;
 	long tel;
 	long addhaar;
 	String pan;

 	Form()
 	{
 		System.out.println("Empty Constructor Created");
 	}
 	Form(String name, long phno, String email, String dob,
 	 char gender,String loc, String edu, String blood)
 	{
 		this.name = name;
 		this.phno = phno;
 		this.email = email;
 		this.dob = dob;
 		this.gender = gender;
 		this.loc = loc;
 		this.edu = edu;
 		this.blood = blood;

 		System.out.println("From Constructor 1");
 	}

 	Form(String name, long phno, String email, String dob,
 	 char gender,String loc, String edu, String blood, String maritialStatus)
 	{
 		this.name = name;
 		this.phno = phno;
 		this.email = email;
 		this.dob = dob;
 		this.gender = gender;
 		this.loc = loc;
 		this.edu = edu;
 		this.blood = blood;
 		this.maritialStatus = maritialStatus;

 		System.out.println("From Constructor 2");
 	}

 	Form(String name, long phno, String email, String dob,
 	 char gender,String loc, String edu, String blood, String maritialStatus, long tel, long addhaar)
 	{
 		this.name = name;
 		this.phno = phno;
 		this.email = email;
 		this.dob = dob;
 		this.gender = gender;
 		this.loc = loc;
 		this.edu = edu;
 		this.blood = blood;
 		this.maritialStatus = maritialStatus;
 		this.tel = tel;
 		this.addhaar = addhaar;

 		System.out.println("From Constructor 3");
 	}

 	Form(String name, long phno, String email, String dob,
 	char gender,String loc, String edu, String blood, String maritialStatus, long tel, long addhaar,String pan)
 	{
 		this(name, phno, email, dob,
 	  gender, loc,  edu,  blood,  maritialStatus);

 		System.out.println("This is Cosntructor chaining");
 		this.pan = pan;
 	}

 	public static void main(String[] args)
 	{
 		Form f1 = new Form();

 		Form f2 = new Form("mahesh",9087345489l,"msmorey@gmail.com","04-03-2002",'M',"Pune","MCA","o+");
 		Form f3 = new Form("mahesh",9087345489l,"msmorey@gmail.com","04-03-2002",'M',"Pune","MCA","o+", "single");
 		Form f4 = new Form("mahesh",9087345489l,"msmorey@gmail.com","04-03-2002",'M',"Pune","MCA","o+", "single",2347658499l, 438517437740l);
 		Form f5 = new Form("mahesh",9087345489l,"msmorey@gmail.com","04-03-2002",'M',"Pune","MCA","o+", "single",2347658499l, 438517437740l,"GNLPM2549");

 	}
 }