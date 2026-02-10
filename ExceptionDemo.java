class ExceptionDemo{
	public static void main(String[] args) {
		
		try{
			System.out.println("outer try block");
			System.out.println(10/0);
			try{
				System.out.println(args[0]);
			}
			catch(IndexOutOfBoundsException e){
				System.out.println("Inner catch block");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Outer catch ");
		}
	}
}