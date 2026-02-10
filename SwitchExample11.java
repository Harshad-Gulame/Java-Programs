class SwitchExample11
{
	public static void main(String[] args) {
		byte a =5;
		switch(a)
		{
		case 1: System.out.println("Case 1");break;
		default : System.out.println("Default");break; 
		case 2 :System.out.println("Case 2");break;
		case 3 : System.out.println("Case 3");break;
		default : System.out.println("Default");break;  // O/P => Duplicate Default value CTE

		}
	}
}