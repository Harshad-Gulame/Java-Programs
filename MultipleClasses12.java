class MultipleClasses12
{
	public static void main(String[] args)
	 {
		System.out.println("Main() Stratr");
		MultipleClasses123.m1();
		MultipleClasses1234.m2();
		System.out.println("main() Ends");

		MultipleClasses12 obj = new MultipleClasses12();
		obj.m3();
		
	}

	public  void m3()
	{
		System.out.println("M3() non static method from MultipleClasses123");
	}
}

class MultipleClasses123
{
	public static void m1()
	{
		System.out.println("m1() from class MultipleClasses123");
	}

	
}

class MultipleClasses1234
{
	public static void m2()
	{
		System.out.println("m2() from MultipleClasses1234");
	}
}