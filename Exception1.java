class Demo extends Demo2{

	
	public   void m1()
	{
		System.out.println("hello from m1()");
		m2();
		System.out.println("hello from m1()");


	}

}

class Demo2{

	public static void m2()
	{
		System.out.println("hello from m()");
		try{
		System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("Exception handaled ");
		}
		System.out.println("hello from m2()");


	}

}
class Exception1
{
	public static void main(String[] args) {

		Demo obj = new Demo();
		obj.m1();
		
	}
}