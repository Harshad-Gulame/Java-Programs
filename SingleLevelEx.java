class Vehicle
{
	String brand ;
	String model ;
	double price ;
	String manufacturingDate ;

	Vehicle(String brand,String model,double price,	String manufacturingDate)
	{
		super();
		this.brand = brand ;
		this.model = model ;
		this.price = price ;
		this.manufacturingDate = manufacturingDate ;
	}

	public void VehicleDetails()
	{
		System.out.println("\n Vehicle details ");
		System.out.println("Brand :"+brand);
		System.out.println("model :"+model);
		System.out.println("price :"+price);
		System.out.println("manufacturingDate :"+manufacturingDate);

	}
}

class Car extends Vehicle
{
	boolean ac ;
	int airBag ;
	boolean sunroof ;
	String fuelType ;

	Car(String brand,String model,double price,	String manufacturingDate,
		boolean ac,int airBag,boolean sunroof,String fuelType)
	{
		super( brand, model,price,manufacturingDate);
		this.ac= ac ;
		this.airBag = airBag ;
		this. sunroof =sunroof ;
		this.fuelType = fuelType ;
	}

	public void startVehicale()
	{
		System.out.println("\n Press Button to start car");
	}
	public void accelerate()
	{
		System.out.println("\press the pandel move the Vehicle");
	}
}
class SingleLevelEx
{
	public static void main(String[] args) 
	{
		Car car1 = new Car("oyo","Fortuner",3500000,"25/2/2025");
		car1.getVehicleDetails();
		car1.getCarDetail();
		car1.accelerate();
	}
}