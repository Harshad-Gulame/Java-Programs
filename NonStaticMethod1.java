class NonStaticMethod1
{
	public static void main(String[] args) 
	{

		NonStaticMethod1 obj = new NonStaticMethod1();
		obj.m1();
		
	}

	public void m1()
	{
		System.out.println("m1() Non Static Method");
		// NonStaticMethod1.m2();	
	}

	public void m2()
	{
		System.out.println("m2() Non static method ");
		// NonStaticMethod1.m3();
	}

	public void m3()
	{
		System.out.println("m3() Non Static Method");
	}
}