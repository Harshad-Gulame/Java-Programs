class ExceptionExample2
{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		m1();
		System.out.println("Main Ends");
	}

	public static void m1()
	{
		System.out.println("m1() Starts ");
		try{
			System.out.println("try block");
			System.out.println();
		}
		catch(Exception e){
			System.out.println("catch Exception");
		}
		finally{
			System.out.println("Finnaly block");
		}
		System.out.println("m1() Ends");
	}
}