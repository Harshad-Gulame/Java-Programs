class Example
{
	public static void main(String[] args) {
		
	}
	static int cnt = 1;

	Example() 
	{
		System.out.println("Example Constructor");
	}

	{
		System.out.println("Non-Static Block Example : "+ cnt++);
	}
}
class ExampleDriver2
{
	public static void main(String[] args)
	 {
		Example obj = new Example();

	}
}