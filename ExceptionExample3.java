class ExceptionExample3
{
	public static void main(String[] args) {
		System.out.println("main Start ");
		m1();
		System.out.println("main Ends");
	}

	public static void m1()
	{
		System.out.println("m1() Starts ");
		try{
			System.out.println("try block");
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.print("Cathc Exception");
			return ;
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("m1() Ends");
	}
}