class MethodExample
{												// Example of method exicution
	public static void main(String[] args) 
	{
		System.out.println("Main  Starts");
		ramesh("hello");
		System.out.println("Main Ends");
	}

	public static void ramesh (String str) 
	{
		System.out.println("ramesh starts");
		int op = suresh();
		System.out.println("ramesh ends");
		System.out.println("Return value"+op);
	}

	public static int suresh ()
	{
		System.out.println("suresh starts");
		ganesh(123);
		System.out.println("suresh end");
		return 123; 	
	}

	public static void ganesh(int num ) 
	{
		System.out.println("ganesh starts");
		System.out.println("data"+num);
		System.out.println("ganesh end");
	}
}