class MultipleClasses123
{
	public static void main(String[] args) 
	{
		System.out.println(" Main Start ");

		MultipleClasses1234.m1();
		MultipleClasses12345 obj = new MultipleClasses12345();
		obj.m2();

		System.out.println("Main End ");
	}
}

class MultipleClasses1234
{
	public static void m1()
	{
		System.out.println("m1() static method from MultipleClasses1234 ");
	}
}

class MultipleClasses12345
{
	public void m2()
	{
		System.out.println("m2() Method from MultipleClasses12345");
	}
}