class StaticMember
{
	static int a=10;		//static variable

	static    // static block
	{
		System.out.println("Hello from static block");
		StaticMember.m1();
	}

	public static void m1()
	{
		System.out.println("Static method");
	}

	public static void main(String[] args) 
	{
		System.out.println(StaticMember.a);
		StaticMember.m1();
	}


}