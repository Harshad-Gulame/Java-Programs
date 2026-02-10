class Address{
	String lane;
	String locality;
	String city;
	int pincode;

	Address(String lane,String locality,String city,int pincode)
	{
		this.lane = lane;
		this.locality = locality;
		this.city = city;
		this.pincode = pincode;
	}

	public void displayAddress(){
		System.out.println("\n Address ");
		System.out.println("Lane : "+ lane);
		System.out.println("locality :"+locality);
		System.out.println("City :"+city);
		System.out.println("Pincode :"+pincode);
	}
}

class Amezon{
		String username ;
		String password ;
		long contact ;
		String email ;
		Address address;

		Amezon()
		{
			super();
		}

		Amezon(String username,String password,long contact,String email,Address address)
		{
			super();
			this.username = username ;
			this.password = password ;
			this.contact = contact ;
			this.email = email ;
			this.address = address;
		}

		public void displayAmezonInfo(){
			System.out.println("\n Amezon Info ");
			System.out.println("Username :"+username);
			System.out.println("password :"+password);
			System.out.println("Contact :"+contact);
			System.out.println("Email :"+email);
			address.displayAddress();
		}
}

class Bank{
	String name;
	String ifscCode ;
	long accountNumber;
	double balance;

	Bank(String name, String ifscCode,double balance)
	{
		this.name = name ;
		this.ifscCode = ifscCode ;
		this.accountNumber =11234567902l ;
		this.balance = balance ;
	}

	public void displayBank(){
		System.out.println("\n Banl Details ");
		System.out.println("Name :"+name);
		System.out.println("IFSCCODE :"+ifscCode);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Balance :"+balance);

	}
}

class AmezonPay extends Amezon{
	String upid ;
	Bank bank;
	int pin;
	double wallet;


	AmezonPay()
	{

	}

	//child amezonpay argument
	AmezonPay( String username,String password,long contact,String email,Address address,
		       String upid,Bank bank,int pin,double wallet)
	{
		 
		super(username,password,contact,email,address);
		this.upid = upid;
		this.bank=bank;
		this.pin = pin;
		this.wallet = wallet;

	}

	public void displayAmezonPay(){
		System.out.println("\n bank Info");
		System.out.println("Upid :"+upid);
		System.out.println("Pin :"+pin);
		System.out.println("wallet :"+wallet);
		bank.displayBank();
	}
}
class AmezonApplication
{
	public static void main(String[] args) {

		Address address = new Address("JM Road","Deccan","Pune",411005);
		address.displayAddress();

		Bank bank = new Bank("Ramesh Kumar","SBIN0000123",50000);
		bank.displayBank();

 
		// AmezonPay pay = new  AmezonPay("Ramesh Kumar","ramesh@123",898789878l,"ramesh@gmail.com","888888@ybl",1234,1500);
		// pay.displayAmezonPay();
		
	}
}