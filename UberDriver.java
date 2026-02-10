import java.util.Scanner ;
import java.util.ArrayList  ;
class Driver{
	private String name ;
	private long contact ;

	Driver(String name , long contact){
		this.name = name ;
		this.contact = contact ;
	}

	public void getDriver(){
		System.out.println("\n DRIVER INFORMATION ");
		System.out.println("Driver : "+name); 
		System.out.println("Contact : "+contact);
	}
}

class Cab{
	static int id = 353345 ;
	private Driver driver ;
	private String number ;
	private String uberId ;
	private String type ;
	private int capacity ;
	private String status = "AVAIL" ;
	private String location = "DECCAN" ;

	String [] typeVehicle = {"hatchback","sedan","suv","muv"} ;
	int [] vehicaleCapacity = {3,4,5,6} ;

	{
		this.uberId = "UBER"+ id++;
	}

	Cab(String number,String type,Driver driver)
	{
		this.number = number ;
		this.type = type.toLowerCase() ;
		int index = 0 ;

		for (String element : typeVehicle ) {
			if(type.toLowerCase().equals(element)){
				break ;
			}
			index++ ;
		}
		this.capacity = vehicaleCapacity[index] ;
		this.driver = driver ;
	}

	public void getCabDetails(){
		System.out.println("\n CAB DETAILS ");
		System.out.println("UberId :"+uberId);
		System.out.println("Status :"+status);
		System.out.println("Type :"+type);
		System.out.println("capacity :"+capacity);
		System.out.println("Location :"+location);
		System.out.println("");
	}

	public String getCabNumber(){
		return number ;
	}

	public Driver getDriver(){
		return driver;
	}

	public String getStatus(){
		return status ;
	}

	public void setStatus(String newStatus){
		status = newStatus ;
	}

	public int getCapacity(){
		return capacity ;
	}

	public String getUberId(){
		return uberId ;
	}
}
class UberDriver
{
	public static void main(String[] args) 
	{
		Uber uber = new Uber();
		uber.homeModule();
	}
}

class Passenger{
	private String name ; // get set
	private long contact ; // get set
	private String email ; // get set
	private String pickuplocation ; // get set 
	private String dropLocation ; // get set
	private int seats ;// get set

	Passenger(String name , long contact, String email, String pickuplocation , String dropLocation,int seats)
	{
		super();
		this.name = name;
		this.contact = contact ;
		this.email = email ;
		this.pickuplocation = pickuplocation ;
		this.dropLocation = dropLocation ;
		this.seats = seats ;
	}

	public String getname(){
		return name ;
	}

	public void setName(String Newname){
		this.name = Newname ;
	}

	public long getContact(){
		return contact ;
	}

	public void setContact(long newContact){
		this.contact = newContact ;
	}

	public String getEmail(){
		return this.email ;
	}

	public void setEmail(String newEmail){
		this.email = newEmail ;
	}

	public String getpickuplocation(){
		return pickuplocation ;
	}

	public void setPickupLocation(String newPickupLocation){
		this.pickuplocation = newPickupLocation ;
	}

	public String getDropLocation(){
		return dropLocation ;
	}

	public void setDropLocation(String newDropLocation){
		this.dropLocation = newDropLocation ;

	}

	public int getSeats(){
		return seats ;
	}

	public void setSeats(int newSeats){
		this.seats = newSeats ;
	}
}

class Uber
{
	ArrayList<Cab> listCabs  = new ArrayList<Cab>();
	Passenger passenger ;
	Cab currentCab ;

	{
		Cab cab1 = new Cab("MH-01-1234","sedan", new Driver("Ramesh Kumar",8806338049l));
		Cab cab2 = new Cab("MH-45-1134","suv", new Driver("Ganesh Kumar",9545164590l));
		Cab cab3 = new Cab("MH-13-1244","hatchback", new Driver("Rajesh Kumar",9632587410l));
		Cab cab4 = new Cab("MH-14-1554","muv", new Driver("Mahesh Kumar",9876543210l));
		Cab cab5 = new Cab("MH-02-1884","sedan", new Driver("Suresh Kumar",8806338049l));
		Cab cab6 = new Cab("MH-06-1999","hatchback", new Driver("Hitesh Kumar",9363852574l));

		listCabs.add(cab1) ;
		listCabs.add(cab2) ;
		listCabs.add(cab3) ;
		listCabs.add(cab4) ;
		listCabs.add(cab5) ;
		listCabs.add(cab6) ;

	}

	{
		System.out.println(" Passenger Details");
		System.out.println("Name :");
		String name  = new Scanner(System.in).nextLine();
		System.out.println("Conatct :");
		long contact = new Scanner(System.in).nextLong() ;
		System.out.println("Email :");
		String email = new Scanner(System.in).nextLine() ;
		System.out.println("Pickup Location :");
		String pickup = new Scanner(System.in).nextLine() ;
		System.out.println("Drop Location :");
		String drop = new Scanner(System.in).nextLine() ;
		System.out.println("Number of people :");
		int seats = new Scanner(System.in).nextInt() ;

		this.passenger = new Passenger(name, contact,email,pickup,drop,seats) ;

	}

	public void homeModule(){
		for (; ; )
		 {
			System.out.println("\n WEl-COME ");
			System.out.println("1. BOOK A RIDE ");
			System.out.println("2. CANCLE RIDE ");
			System.out.println("3. RIDE HISTORY ");
			System.out.println("4. LOGOUT \n");
			System.out.println("Enter your responce :");
			int responce = new Scanner(System.in).nextInt();

			switch(responce){
			case 1 ->bookRide();
			case 2 ->cancleRide();
			case 3 -> rideHistory();
			case 4 -> {
				System.out.println("THANK U FOR USING UBER  ");
			  }
			default -> System.out.println("INVALID RESPONCE");
			}
		}
	}

	public void bookRide(){
		System.out.println("\n BOOK-A-RIDE MODULE \n");
		for (Cab element : listCabs)
		 {
			if(element.getStatus()=="AVAIL" && passenger.getSeats()<=element.getCapacity())
				element.getCabDetails();
		}
		System.out.print("\n Enter the UberID :");
		String uberId = new Scanner(System.in).next();
		boolean assume = false ;
		for (Cab ele : listCabs) {
			if (ele.getUberId().equals(uberId)) {
				System.out.println("YOUR RIDE HAS BEEN CONFERMED ");
				currentCab = ele ;
				assume = true ;
				System.out.println("YOUR RIDE SETAIL ");
				ele.getCabDetails();
				System.out.println("Cab Number : "+ele.getCabNumber());
				ele.getDriver().getDriver();
				break ;
			}
		}

		if (!assume) 
			System.out.println("\n INVALID UBER ID \n ");
		
	}

	public void cancleRide(){
		if (currentCab==null) {
			System.out.println("\n NO RIDE HAS BEEN BOOKED \n");
			return ;
		}
		System.out.println("\n CANCLE A RIDE MODULE \n ");
		System.out.println("YOUR RIDE DETAILS ");
		currentCab.getCabDetails();
		System.out.println("Cab Number : "+currentCab.getCabNumber());
		currentCab.getDriver().getDriver();

		System.out.println("Do YOU WANT TO CANCLE YOUR RIDE (YES?NO");
		String resp = new Scanner(System.in).next();
		if(resp.equalsIgnoreCase("YES")){
			System.out.println("YOUR RIDE HAS BEEN CANCLED ");

			currentCab = null;
		}

	}

	public void rideHistory(){
		System.out.println("RIDE HISTORY MODULE ");
	}
}