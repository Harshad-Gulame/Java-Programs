class NonStaticBlock
{
	int a = 10;

	{
		System.out.println("Non Static Block ");
	}

	public void m1()
	{
		System.out.println("non static method ");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		NonStaticBlock obj = new NonStaticBlock();
		System.out.println(obj.a);

		obj.m1();
	}
}