class SwitchExample1
{
	public static void main(String[] args) 
	{
		byte a = 127;
		switch(a)
		{
		case 1: System.out.println("Case 1");break;
		case 127: System.out.println("Case 2");break;
		case 128: System.out.println("Case 3");break; //lossy conversion byte to int CTC
		default: System.out.println("Default");break;

		}
	}
}