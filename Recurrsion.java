class Recurrsion
{
	public static void main(String[] args) 
	{
		Recurrsion obj = new Recurrsion();
		obj.m1();
	}

	public   void m1()
	{
		System.out.println("m1() ");

		m2();
	}

	public   void m2()
	{

		m1();

	}
}