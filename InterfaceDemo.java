// interface InterfaceDemo1
// {
// 	public static void m1()
// 	{
// 		System.out.println("m1() Method");
// 	}
// }
abstract class InterfaceDemo1
{
	String name;

	InterfaceDemo1(String name)
	{ 
		this.name  = name;
	}
}
class InterfaceDemo extends InterfaceDemo1
{
	int year;
	InterfaceDemo(int year, String name)
	{
		super(name);
		this.year = year;
	}
	public static void main(String[] args) {
		
		InterfaceDemo obj = new InterfaceDemo(2025,"ramesh");
		System.out.println(obj.name);
		System.out.println(obj.year);


	}
}