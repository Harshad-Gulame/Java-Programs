import java.util.Scanner;
class Driver
{
	private String name ;
	private long contact ;

	Driver(String name , long contact){
		this.name = name ;
		this.contact = contact ;
	}

	public void getDriver(){
		System.out.println("\n DRIVER DETAILS ");
		System.out.println("Driver :"+name);
		System.out.println("Contact : "+contact +"\n");
	}
}

class Cab
{
	static int id = 353345 ;
	private Driver driver ;
	private String number ;
	private String uberId ;
	private String type ;
	private int capacity ;
	private String status = "AVAIL";
	private String location = "Deccan" ;

	String [] typeVehicle = {"hatchback","sedan","suv","xuv"};
	int [] vehicaleCapacity = {3,4,5,6};

	{
		this.uberId = "UBER"+ id++;
	}

	Cab(String number , String type)
	{
		this.number = number ;
		this.type  = type.toLowerCase() ;

		int index = 0;
		for(String element : typeVehicle)
		{
			if(type.toLowerCase().equals(element))
			{
				break ;
			}
			index++ ;
		}
		this.capacity = vehicaleCapacity[index];

		System.out.println("Enter The Driver Details : ");
		System.out.println("Enter a name : ");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Enetr The Contact number : ");
		long contact = new Scanner(System.in).nextLong();
		this.driver = new Driver(name,contact);
	}

	public void getCabDetails(){
		System.out.println("\n CAB DETAILS ");
		System.out.println("Uber ID :"+uberId);
		System.out.println("Status : "+status);
		System.out.println("Cab Number :"+number);
		System.out.println("Type :"+type);
		System.out.println("capacity :"+capacity);
		System.out.println("Location :"+ location);
		driver.getDriver();
		System.out.println("");
	}
}

class Uber
{
	public static void main(String[] args) 
	{
		System.out.println("\n WELCOME ");
		System.out.println("Enter cab Number :");
		String cabNumber = new Scanner(System.in).next();
		System.out.println("Type of Cab :");
		String type = new Scanner(System.in).next();
		Cab cab1 = new Cab(cabNumber,type);
		cab1.getCabDetails();	
	}
}