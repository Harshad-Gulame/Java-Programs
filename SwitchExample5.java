class SwitchExample5
{
	public static void main(String[] args) 
	{
		int a = 2;
		switch(a)
		{
		case 2: System.out.println("Case 1");break; // duplicate case lable CTE
		case 2:System.out.println("Case 2");break;
		}
	}
}