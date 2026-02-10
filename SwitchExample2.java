class SwitchExample2
{
	 
		public static void main(String[] args)
		 {
			int a = 127;
			switch(a)
			{
			case 97: System.out.println("Case 1");break;
			case 'a': System.out.println("Case 2");break;  //duplicate case lable CTE
			case 128 : System.out.println("Case 3");break;
			default : System.out.println("Default");break;
			}
		}
	}
