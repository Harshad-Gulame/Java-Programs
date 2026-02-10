class Processor{
	String generation ;
	String ram;
	double clockSpeed;
	String name;

	Processor()
	{
		super();
	}

	Processor(String generation ,String ram,double clockSpeed, String name)
	{
		super();
		this.generation = generation;
		this.ram = ram;
		this.clockSpeed = clockSpeed;
		this.name = name;
	}

	// Copy Cunstructor

	Processor( Processor oldMobile){
		super();
		this.generation = oldMobile.generation;
		this.ram = oldMobile.ram;
		this.name = oldMobile.name;
		this.clockSpeed = oldMobile.clockSpeed;
	}

	public void displayProcessor()
	{
		System.out.println("\n Processor Details ");
		System.out.println("Name :"+name);
		System.out.println("generation :"+generation);
		System.out.println("Ram :"+ram);
		System.out.println("ClockSpeed :"+clockSpeed);
	}

}

class Mobile extends Processor{
	String brand ;
	String model ;
	double price ;
	Processor processor ;

	Mobile()
	{
		super();
	}

	Mobile(String brand,String model , double price,Processor processor)
	{
		super();
		this.brand = brand ;
		this.model = model ;
		this.price = price ;
	}

	// Copuy Cunstructor

	Mobile(Mobile oldMobile)
	{
		super(oldMobile.processor);
		this.brand = oldMobile.brand;  // data copied from old to new
		this.model = oldMobile.model;
		this.price = oldMobile.price;
		this.processor = oldMobile.processor; // referance
	}

	public void displayMobile()
	{
		System.out.println("\n Mobile Details ");
		System.out.println("Brand : "+brand);
		System.out.println("Model :"+model);
		System.out.println("Price :"+price);
		processor.displayProcessor();
	}
}


class CopyConstructor
{
	public static void main(String[] args) 
	{
		Processor processor = new Processor("A19","8",4.04,"Bionic");

		Mobile mobile = new Mobile("Apple","17Air",129000,processor);

		Mobile copy1 = new Mobile(mobile);
		copy1.model = "17Pro";
		copy1.price = 135000;
		copy1.displayMobile();

		System.out.println("_________________________________");

		copy1.processor.clockSpeed = 0;

		copy1.displayMobile();
		mobile.displayMobile();
	}
}