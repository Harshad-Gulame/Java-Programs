class Amezon{
	private String username ;
	private String email ;
	private String password ;
	private long contact ;
	private String gender ;
	private String address ;

	Amezon(String username,String email,String password,long contact,String gender,String address)
	{
		this.username = username ;
		this.email = email ;
		this.password = password ;
		this.contact = contact ;
		this.gender = gender ;
		this.address = address ;
	}

	public void getAmezonDetail()
	{
		System.out.println("\n Amezon Detail");
		System.out.println("username :"+username);
		System.out.println("Email :"+password);
		System.out.println("Contact :"+contact);
		System.out.println("Gender :"+gender);
		System.out.println("Address :"+address);
	}
}
class AmezonPrime extends Amezon
{
	private String profilePhoto ;
	private String password1 ;
	private String subscription ;
	private double price ;
	private int users ;

	AmezonPrime(String username,String email,String password,long contact,String gender,String address,
		        String profilePhoto,String password1,String subscription,double price,int users)
	{
		super(username, email, password,contact, gender, address);
		this.profilePhoto = profilePhoto;
		this.password1 = password1 ;
		this.subscription = subscription ;
		this.price = price ;
		this.users = users ;
	}

	public void getAmezonPrimeInfo()
	{
		System.out.println("\n Amezon Prime Details ");
		System.out.println("Profile Photo :"+profilePhoto);
		System.out.println("password :"+password1);
		System.out.println("Subsctiption :"+subscription);
		System.out.println("Price :"+price);
		System.out.println("No of ussers :"+users);
	}
}
class MultilevelInheritance
{
	public static void main(String[] args) {


		AmezonPrime obj = new AmezonPrime("Ramesh Kumar","ramesh@gmail.com","ramesh@gmail.com",9874561230l,"Male","Deccan","ramesh.jpg","ramesh123","Golden",550,5);
		obj.getAmezonDetail();
		obj.getAmezonPrimeInfo();
		
	}
}