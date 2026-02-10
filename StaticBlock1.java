class StaticBlock1
{

	public static void main(String[] args) 
	{
		Example obj = new Example();
		obj.m1();

		System.out.println("main");
	}

	static {
		System.out.println("Non Static block from main");
	}
}

class Example
{

	static String str = "abc";
	int a = 20;

	{
		System.out.println("Non Static Block");
	}

	static{
		System.out.println("Static Block");
	}

	public void m1()
	{
		System.out.println("m1 non ststic MEthod");
	}

	public static void m2(){
		System.out.println("m2 static Method");
	}
}