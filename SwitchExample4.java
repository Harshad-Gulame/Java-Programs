class SwitchExample4
{
	public static void main(String[] args)
	 {
		int a = 1;
		final int b =7;
		switch(a)
		{
		case 1 : System.out.println("case 1"); break; //  O/P=> case 1
		case b : System.out.println("case 2");break;
		default : System.out.println("Default");break;
		}
	}
}