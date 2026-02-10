class Engine
{
	String type ;
	String transmisson ;
	int piston ;
	double bhp ;
	int gears ;

	Engine(String type,String transmisson,int piston,double bhp,int gears)
	{
		this.type = type ;
		this.transmisson = transmisson ;
		this.piston = piston ;
		this.bhp = bhp ;
		this.gears = gears ;
	}

	public void displayEngine()
	{
		System.out.println("\n Engine Information ");
		System.out.println("Type :"+type);
		System.out.println("transmisson :"+transmisson);
		System.out.println("piston :"+piston);
		System.out.println("bhp :"+bhp);
		System.out.println("gears :"+gears);
	}

	public void startEngine()
	{
		System.out.println("\n Enginee Started ");
	}
}

class Car
{
	String brand ;
	String model ;
	String color ;
	double price ;
	Engine engine ;

	Car(String brand,String model,String color,double price)
	{
		this.brand = brand ;
		this.model = model ;
		this.color = color ;
		this.price = price ;
		this.engine = new Engine("Petrol","Manual",4450,2500,6);
	}

	public void displayCar()
	{
		System.out.println("\n Car Information ");
		System.out.println("Model :"+model);
		System.out.println("Brand :"+brand);
		System.out.println("Colour :"+color);
		System.out.println("price :"+price);

	}
}

class CompositioCarDriver
{
	public static void main(String[] args) 
	{

		Car object = new Car("Fortuner","Toyato","Black",5000000);
		object.displayCar();
		object.engine.displayEngine();
		object.engine.startEngine();
		
	}
}