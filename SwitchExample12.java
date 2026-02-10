class SwitchExample12
{
	public static void main(String[] args)
	 {
		byte a = 4;

		switch(a)
		{
		case 1:
			{
				System.out.println("Case 1");
			}
			System.out.println("Hellooooooo");
		case 2:
			{
				System.out.println("Case 2");
				break;
			}
		case 3:
			{
				System.out.println("Case 3");  //O/P => no error no output
				break;
			}
		}
	}
}