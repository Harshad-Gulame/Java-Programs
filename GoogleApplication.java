class Google{
	String firstName ;
	String lastName ;
	String email ;
	long contact ;
	String password ;
	String dob;
	String gender ;

	Google(String firstName, String lastName,String email,long contact,String password,String dob,String gender)
	{
		this.firstName = firstName;
		this.lastName = lastName ;
		this.email = email ;
		this.contact = contact;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
	}
	public void displayGoogle()
	{
		System.out.println("\n GOOOGLE ACCOUNT DETAILS ");
		System.out.println("Username : "+firstName+" "+lastName);
		System.out.println("Email : "+email);
		System.out.println("Contact : "+contact);
		System.out.println("password : "+password);
		System.out.println("DOB : "+dob);
		System.out.println("Gender : "+gender+"\n");
	}
}

class GoogleMeet extends Google {
	String hostName ;
	String schedule ;
	String id ; 
	final int CAPAVITY = 100;
	int join;

	GoogleMeet(String firstName,String lastName, String email,long contact, String password , String dob,String gender,
				String hostName,String schedule,String id,int join)
	{
		super(firstName,lastName,email,contact,password,dob,gender);
		this.hostName = hostName;
		this.schedule = schedule;
		this.id = id;
		this.join = join;
	}

	public void displayGoogleMeet()
	{
		System.out.println("\n GOOGLEMEET DETAILS ");
		System.out.println("Host Name : "+hostName);
		System.out.println("Schedule : "+schedule);
		System.out.println("ID : "+id);
		System.out.println("Capacity : "+CAPAVITY);
		System.out.println("Join : "+join);
	}
}

class GoogleClassroom extends Google{
	String subject;
	String name ; 
	String code ; 
	String trainer ;
	int numberStudents ;

	GoogleClassroom(String firstName,String lastName, String email,long contact, String password , String dob,String gender,
				String subject,String name,String code,String trainer,int numberStudents)
	{
		super(firstName,lastName,email,contact,password,dob,gender);
		this.subject = subject;
		this.name = name;
		this.code = code;
		this.trainer = trainer;
		this.numberStudents = numberStudents;
	}

	public void displayGoogleClassroom(){
		System.out.println("\n Details of GOOGLE CLASSROOM ");
		System.out.println("Subject : "+subject);
		System.out.println("Name : "+name);
		System.out.println("Code : "+code);
		System.out.println("Trainer : "+trainer);
		System.out.println("Number Students :"+numberStudents);
	}
}

class Bank{
	String name;
	long number ; 
	double balance;
	Bank(String name , long number,double balance)
	{
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	public void displayBank(){
		System.out.println("\n BANK DETAILS ");
		System.out.println("Name : "+name);
		System.out.println("Number : "+ number);
		System.out.println("balance  : "+balance);
	}
}

class GooglePay extends Google{
	long contact ; 
	String upiid ;
	Bank bank = new Bank("SBI",8806338049l,50000);
	int pin;

	GooglePay(String firstName,	String lastName,String email,long contact,String password,String dob,String gender
				,long contact1,String upiid,int pin)
	{
		super(firstName,lastName,email,contact,password,dob,gender);
		this.contact = contact1;
		this.upiid = upiid;
		this.pin = pin;
	}

	public void displayGooglePay(){
		displayGoogle();	 
		System.out.println("\n GooglePay Details ");
		System.out.println("Contact : "+contact);
		System.out.println("UPI ID : "+upiid);
		System.out.println("Pin : "+pin);
		bank.displayBank();
	}
}
class GoogleApplication
{
	public static void main(String[] args) {

		GooglePay obj1 = new GooglePay("Ramesh","Kumar","rameshkumar@gmail.com",7894561230l,"ramesh@123","01/01/2004","Male",
										6978451230l,"6978451230@ybl",1234);
		obj1.displayGooglePay();

		GoogleMeet obj2 = new GoogleMeet("Suresh","Kumar","sureshkumar@gmail.com",8855997744l,"suresh@123","01/02/2000","Male",
											"Vikas Kalal","2-05-2025","SQLM65",85);
		obj2.displayGoogleMeet();

		GoogleClassroom obj3 = new GoogleClassroom("Shrikant","Kokate","shrikantkokate@g.gmail.com",9988774455l,"shrikant@123","02/05/2001","Male",
													"Core Java","M65","QSP-JS-m65","Shriaknt Sir",75);
		obj3.displayGoogleClassroom();
		
	}
}