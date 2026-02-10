class SwitchExample3
{
	public static void main(String[] args) {
		int a = 1;
		int b= 2;
		switch(a)
		{
		case 1: System.out.println("Case 1");break;
		case b :System.out.println("Case 2");break;  // constant ecpression required CTE
		default : System.out.println("Default");break;
		}
	}
}