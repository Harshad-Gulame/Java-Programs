class NonStaticMember
{
	public void m1()
	{
		System.out.println("m1() non static block");
	}

	public void m2()
	{
		System.out.println("m2() Non static block");
		 
	}
	public static void main(String[] args) 
	{
		NonStaticMember obj = new NonStaticMember();
		obj.m2();
		obj.m1();
	}
}