class Example
{
	public static void main(String[] args) 
	{
		System.out.println("Main() Start ");	
		m1();

		Example obj = new Example();
		obj.m2();
		Example2.m3();
		System.out.println("Main() Ends");

	    Example2 obj1 = new Example2();
	    obj1.m4();
	}

	public static int  m1()
	{
		System.out.println("m1() Start ");
		System.out.println("m1() Ends ");
		return 10;


	}

	public  void m2()
	{
		System.out.println("m2() Start");
		System.out.println("m2() Ends ");
		m3();
	}

	public void m3()
	{
		System.out.println("m3() Non Static from Example");
	}
}

class Example2
{
	public static void m3()
	{
		System.out.println("M3() Starts from Exaple2 ");
		System.out.println("m3() Ends from Example2 ");
	}

	public void m4()
	{
		System.out.println("m4() Non Static From Example2");
	}

}