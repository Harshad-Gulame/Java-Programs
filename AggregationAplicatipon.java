class Student
{
	String name ;
	String address ;
	long contact ;
	Student (String name,String address, long contact)
	{
		this.name = name ;
		this.address = address ;
		this.contact = contact ;

	}

	public void displayStudent()
	{
		System.out.println("\n Student information");
		System.out.println("Name :"+name);
		System.out.println("address :"+address);
		System.out.println("Contact :"+contact); 
	}
}

class Room
{
	int roomNumber ;
	int floar ;

	Room(int roomNumber , int floar)
	{
		this.roomNumber = roomNumber ;
		this.floar = floar ;

	}

	public void displayRoom()
	{
		System.out.println("\n Room Information ");
		System.out.println("Room Number :"+roomNumber);
		System.out.println("Floar :"+floar);
	}
}

class Warden
{
	String wardenName ;
	long contact ;

	Warden(String wardenName,long contact)
	{
		this.wardenName = wardenName ;
		this.contact = contact ;
	}

	public void displayWarden()
	{
		System.out.println("\n Warden Information ");
		System.out.println("College Name :"+wardenName);
		System.out.println("Contact :"+contact);
	
	}

}

class Hostel
{
	String hostelName ;
	String address ;
	long contact ;
	double fee ;
	Room room ;
	Student student ;
	Warden warden ;

	Hostel(String hostelName , String address,long contact,double fee,Room room,Student student,Warden warden)
	{
		this.hostelName = hostelName ;
		this. address = address ;
		this.contact = contact ;
		this. fee =fee ;
		this. room = room ;
		this.student = student ;
		this.warden =warden ;
	}

	public void displayHostel()
	{
		System.out.println("\n Hostel Information");
		System.out.println("Hostel Name :"+hostelName);
		System.out.println("address :"+address);
		System.out.println("contact :"+contact);
		System.out.println("Fees :"+fee);
		room.displayRoom();
		warden.displayWarden();
	}
}
class AggregationAplicatipon
{
	public static void main(String[] args) 
	{
		
		Student student = new Student("Harshad","Solapur",8806338049l);
		Room room = new Room(101,1);
		Warden warden = new Warden("Rames Kumar",9876543210l);

		Hostel hostel = new Hostel("JR Hostel","Navi Peth Pune",7895456321l,25000,room,student,warden);	
		hostel.displayHostel();
	}
}